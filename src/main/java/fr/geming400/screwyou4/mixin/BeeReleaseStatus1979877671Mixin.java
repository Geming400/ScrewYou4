package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.entity.BeehiveBlockEntity.BeeReleaseStatus.class)
public class BeeReleaseStatus1979877671Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/level/block/entity/BeehiveBlockEntity$BeeReleaseStatus;", cancellable = true)
    private static void values__1132230825(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1132230825L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/level/block/entity/BeehiveBlockEntity$BeeReleaseStatus;", cancellable = true)
    private static void valueOf__647681452(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-647681452L))
            info.setReturnValue(net.minecraft.world.level.block.entity.BeehiveBlockEntity.BeeReleaseStatus.HONEY_DELIVERED);
    }


}
