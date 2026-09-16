package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.LevelDataAndDimensions.class)
public class LevelDataAndDimensions_2138710898Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1230084629(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1230084629L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1385832874(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1385832874L))
            info.setReturnValue("3\u6D15JrQ8@AE\uD447\u83D4\uD20CCW:FJKX_\u61A5\\");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__1598904308(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1598904308L))
            info.setReturnValue(-176955826);
    }

    @Inject(at = @At("HEAD"), method = "dimensions()Lnet/minecraft/world/level/levelgen/WorldDimensions$Complete;", cancellable = true)
    private void dimensions__1577561853(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1577561853L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "create(Lnet/minecraft/world/level/storage/WorldData;Lnet/minecraft/world/level/levelgen/WorldGenSettings;Lnet/minecraft/world/level/levelgen/WorldDimensions$Complete;)Lnet/minecraft/world/level/storage/LevelDataAndDimensions;", cancellable = true)
    private static void create__1100636473(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1100636473L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "worldDataAndGenSettings()Lnet/minecraft/world/level/storage/LevelDataAndDimensions$WorldDataAndGenSettings;", cancellable = true)
    private void worldDataAndGenSettings__2089336067(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2089336067L))
            info.setReturnValue(null);
    }


}
