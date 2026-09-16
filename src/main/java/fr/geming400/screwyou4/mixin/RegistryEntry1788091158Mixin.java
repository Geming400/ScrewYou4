package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.core.RegistryAccess.RegistryEntry.class)
public class RegistryEntry1788091158Mixin {
        @Inject(at = @At("HEAD"), method = "value()Lnet/minecraft/core/Registry;", cancellable = true)
    private void value__1008571440(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1008571440L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_879464890(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(879464890L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1736452613(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1736452613L))
            info.setReturnValue("\"3\u74C3\u843Ci&%J:UDQG':o\uFCC5S}EU^|f\u63D6Pg(ZQ@&@$i}<7\uB1E0b+v.\"}Z?loP\u86FF^00\u6D0B!X\uBB5D!s$k?aN");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__1949524047(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1949524047L))
            info.setReturnValue(459039763);
    }

    @Inject(at = @At("HEAD"), method = "key()Lnet/minecraft/resources/ResourceKey;", cancellable = true)
    private void key_87788744(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(87788744L))
            info.setReturnValue(null);
    }


}
