package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.dedicated.Settings.MutableValue.class)
public class MutableValue2067501822Mixin {
        @Inject(at = @At("HEAD"), method = "get()Ljava/lang/Object;", cancellable = true)
    private void get_613573487(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(613573487L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "update(Lnet/minecraft/core/RegistryAccess;Ljava/lang/Object;)Lnet/minecraft/server/dedicated/Settings;", cancellable = true)
    private void update__798295642(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-798295642L))
            info.setReturnValue(null);
    }


}
