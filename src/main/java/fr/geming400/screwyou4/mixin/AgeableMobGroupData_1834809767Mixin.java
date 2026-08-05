package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.AgeableMob.AgeableMobGroupData.class)
public class AgeableMobGroupData_1834809767Mixin {
        @Inject(at = @At("HEAD"), method = "increaseGroupSizeByOne()V", cancellable = true)
    private void increaseGroupSizeByOne_1873084505(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1873084505L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isShouldSpawnBaby()Z", cancellable = true)
    private void isShouldSpawnBaby_1873088349(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1873088349L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getGroupSize()I", cancellable = true)
    private void getGroupSize_1873072012(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1873072012L))
            info.setReturnValue(64665589);
    }

    @Inject(at = @At("HEAD"), method = "getBabySpawnChance()F", cancellable = true)
    private void getBabySpawnChance_1873069129(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1873069129L))
            info.setReturnValue(2.67038E8F);
    }


}
