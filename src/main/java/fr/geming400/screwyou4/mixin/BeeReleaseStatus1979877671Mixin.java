package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.entity.BeehiveBlockEntity.BeeReleaseStatus.class)
public class BeeReleaseStatus1979877671Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/level/block/entity/BeehiveBlockEntity$BeeReleaseStatus;", cancellable = true)
    private static void values__1646026123(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1646026123L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/level/block/entity/BeehiveBlockEntity$BeeReleaseStatus;", cancellable = true)
    private static void valueOf_2138252156(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2138252156L))
            info.setReturnValue(net.minecraft.world.level.block.entity.BeehiveBlockEntity.BeeReleaseStatus.EMERGENCY);
    }


}
