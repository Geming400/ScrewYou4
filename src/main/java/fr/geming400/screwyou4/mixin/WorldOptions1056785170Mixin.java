package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.WorldOptions.class)
public class WorldOptions1056785170Mixin {
        @Inject(at = @At("HEAD"), method = "seed()J", cancellable = true)
    private void seed_1095048377(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1095048377L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "testWorldWithRandomSeed()Lnet/minecraft/world/level/levelgen/WorldOptions;", cancellable = true)
    private static void testWorldWithRandomSeed__1038723141(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1038723141L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "defaultWithRandomSeed()Lnet/minecraft/world/level/levelgen/WorldOptions;", cancellable = true)
    private static void defaultWithRandomSeed__1038723141(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1038723141L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "withBonusChest(Z)Lnet/minecraft/world/level/levelgen/WorldOptions;", cancellable = true)
    private void withBonusChest_1809369805(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1809369805L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "withStructures(Z)Lnet/minecraft/world/level/levelgen/WorldOptions;", cancellable = true)
    private void withStructures_1809369805(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1809369805L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "generateBonusChest()Z", cancellable = true)
    private void generateBonusChest_1095063753(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1095063753L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "generateStructures()Z", cancellable = true)
    private void generateStructures_1095063753(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1095063753L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isOldCustomizedWorld()Z", cancellable = true)
    private void isOldCustomizedWorld_1095063753(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1095063753L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "parseSeed(Ljava/lang/String;)Ljava/util/OptionalLong;", cancellable = true)
    private static void parseSeed__112804910(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-112804910L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "withSeed(Ljava/util/OptionalLong;)Lnet/minecraft/world/level/levelgen/WorldOptions;", cancellable = true)
    private void withSeed__1949394730(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1949394730L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "randomSeed()J", cancellable = true)
    private static void randomSeed_1095048625(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1095048625L))
            info.setReturnValue(null);
    }


}
