package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.LevelDataAndDimensions.WorldDataAndGenSettings.class)
public class WorldDataAndGenSettings_1907835254Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_999208985(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(999208985L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1616708518(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1616708518L))
            info.setReturnValue("=,`2s\u1F07SCvqq;B>je>gZ*vC*|X5\u9DE90k!Q|\"5YU =h\uF91BHhVb\uFE4FT/\u9BBA9\u9447UQkRO D");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__1829779952(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1829779952L))
            info.setReturnValue(1369325621);
    }

    @Inject(at = @At("HEAD"), method = "data()Lnet/minecraft/world/level/storage/WorldData;", cancellable = true)
    private void data__176948573(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-176948573L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "genSettings()Lnet/minecraft/world/level/levelgen/WorldGenSettings;", cancellable = true)
    private void genSettings__1281414946(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1281414946L))
            info.setReturnValue(null);
    }


}
