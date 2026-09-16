package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.AgeableMob.AgeableMobGroupData.class)
public class AgeableMobGroupData_1834809767Mixin {
        @Inject(at = @At("HEAD"), method = "getGroupSize()I", cancellable = true)
    private void getGroupSize_1193057634(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1193057634L))
            info.setReturnValue(463223011);
    }

    @Inject(at = @At("HEAD"), method = "isShouldSpawnBaby()Z", cancellable = true)
    private void isShouldSpawnBaby__1727792151(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1727792151L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getBabySpawnChance()F", cancellable = true)
    private void getBabySpawnChance_1936225414(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1936225414L))
            info.setReturnValue(8.928735E8F);
    }

    @Inject(at = @At("HEAD"), method = "increaseGroupSizeByOne()V", cancellable = true)
    private void increaseGroupSizeByOne_1334821064(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1334821064L))
            info.cancel();
    }


}
