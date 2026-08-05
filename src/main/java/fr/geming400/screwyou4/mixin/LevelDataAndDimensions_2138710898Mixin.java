package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.LevelDataAndDimensions.class)
public class LevelDataAndDimensions_2138710898Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__770744140(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-770744140L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1003250922(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1003250922L))
            info.setReturnValue("(d\u7CEBWynN\u80C0i>|\uA5E4&84/ZujJX0=0\u2569c%o@XB5\u34D1\u1551fW?US8D<H7u+Z<Fb@.az _0IE4\u4B71:!");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__2117993657(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2117993657L))
            info.setReturnValue(2142667117);
    }

    @Inject(at = @At("HEAD"), method = "dimensions()Lnet/minecraft/world/level/levelgen/WorldDimensions$Complete;", cancellable = true)
    private void dimensions_1507503920(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1507503920L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "create(Lnet/minecraft/world/level/storage/WorldData;Lnet/minecraft/world/level/levelgen/WorldGenSettings;Lnet/minecraft/world/level/levelgen/WorldDimensions$Complete;)Lnet/minecraft/world/level/storage/LevelDataAndDimensions;", cancellable = true)
    private static void create__490688957(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-490688957L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "worldDataAndGenSettings()Lnet/minecraft/world/level/storage/LevelDataAndDimensions$WorldDataAndGenSettings;", cancellable = true)
    private void worldDataAndGenSettings__1906202043(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1906202043L))
            info.setReturnValue(null);
    }


}
