package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.Entity.RemovalReason.class)
public class RemovalReason697238547Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/entity/Entity$RemovalReason;", cancellable = true)
    private static void values_1257295788(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1257295788L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/entity/Entity$RemovalReason;", cancellable = true)
    private static void valueOf__1027879217(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1027879217L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "shouldDestroy()Z", cancellable = true)
    private void shouldDestroy_735517130(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(735517130L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "shouldSave()Z", cancellable = true)
    private void shouldSave_735517130(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(735517130L))
            info.setReturnValue(null);
    }


}
