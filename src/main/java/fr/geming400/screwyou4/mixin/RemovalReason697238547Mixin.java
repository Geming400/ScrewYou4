package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.Entity.RemovalReason.class)
public class RemovalReason697238547Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/entity/Entity$RemovalReason;", cancellable = true)
    private static void values_294780750(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(294780750L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/entity/Entity$RemovalReason;", cancellable = true)
    private static void valueOf__587682137(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-587682137L))
            info.setReturnValue(net.minecraft.world.entity.Entity.RemovalReason.KILLED);
    }

    @Inject(at = @At("HEAD"), method = "shouldDestroy()Z", cancellable = true)
    private void shouldDestroy_1218894691(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1218894691L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "shouldSave()Z", cancellable = true)
    private void shouldSave__190283270(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-190283270L))
            info.setReturnValue(false);
    }


}
