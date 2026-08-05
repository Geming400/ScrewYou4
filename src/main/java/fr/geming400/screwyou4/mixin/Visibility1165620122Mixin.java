package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.entity.Visibility.class)
public class Visibility1165620122Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/level/entity/Visibility;", cancellable = true)
    private static void values_1849283645(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1849283645L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/level/entity/Visibility;", cancellable = true)
    private static void valueOf_1418205206(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1418205206L))
            info.setReturnValue(net.minecraft.world.level.entity.Visibility.TICKING);
    }

    @Inject(at = @At("HEAD"), method = "isAccessible()Z", cancellable = true)
    private void isAccessible_1386922193(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1386922193L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "isTicking()Z", cancellable = true)
    private void isTicking_532309398(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(532309398L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "fromFullChunkStatus(Lnet/minecraft/server/level/FullChunkStatus;)Lnet/minecraft/world/level/entity/Visibility;", cancellable = true)
    private static void fromFullChunkStatus_1573994320(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1573994320L))
            info.setReturnValue(net.minecraft.world.level.entity.Visibility.TICKING);
    }


}
