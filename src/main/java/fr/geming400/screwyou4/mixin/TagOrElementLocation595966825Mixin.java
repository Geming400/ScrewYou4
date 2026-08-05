package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.ExtraCodecs.TagOrElementLocation.class)
public class TagOrElementLocation595966825Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1981479084(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1981479084L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__539493646(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-539493646L))
            info.setReturnValue("F\uA8F9\",d,1fa.,`\u74B7I+hhQx\uA8FB>q`>h\u9B30@E|^t,{+]/Bw6luU%Djjb[-A'a\u8C3FN\uA388\u06278|`*)),OXp\uB98Df3l0Hc(H%&:/W$b4Ki[t/V3U'!]GhK{");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_634229567(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(634229567L))
            info.setReturnValue(1497348838);
    }

    @Inject(at = @At("HEAD"), method = "id()Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void id__1847099728(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1847099728L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "tag()Z", cancellable = true)
    private void tag_634245408(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(634245408L))
            info.setReturnValue(true);
    }


}
