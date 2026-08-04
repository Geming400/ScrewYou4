package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.dimension.DimensionType.MonsterSettings.class)
public class MonsterSettings24075523Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1409587782(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1409587782L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1111384452(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1111384452L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_62338265(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(62338265L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "monsterSpawnLightTest()Lnet/minecraft/util/valueproviders/IntProvider;", cancellable = true)
    private void monsterSpawnLightTest_1849355916(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1849355916L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "monsterSpawnBlockLightLimit()I", cancellable = true)
    private void monsterSpawnBlockLightLimit_62337769(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(62337769L))
            info.setReturnValue(null);
    }


}
