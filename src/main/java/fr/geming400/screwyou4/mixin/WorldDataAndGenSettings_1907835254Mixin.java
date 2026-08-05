package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.LevelDataAndDimensions.WorldDataAndGenSettings.class)
public class WorldDataAndGenSettings_1907835254Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1001619784(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1001619784L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_772375278(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(772375278L))
            info.setReturnValue("&1xS:IFP9^dVz!QYⲰ0n萜NEG(nQ");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1946097995(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1946097995L))
            info.setReturnValue(732219507);
    }

    @Inject(at = @At("HEAD"), method = "data()Lnet/minecraft/world/level/storage/WorldData;", cancellable = true)
    private void data_1059240205(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1059240205L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "genSettings()Lnet/minecraft/world/level/levelgen/WorldGenSettings;", cancellable = true)
    private void genSettings__1117232879(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1117232879L))
            info.setReturnValue(null);
    }


}
