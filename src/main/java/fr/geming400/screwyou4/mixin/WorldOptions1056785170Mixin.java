package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.WorldOptions.class)
public class WorldOptions1056785170Mixin {
        @Inject(at = @At("HEAD"), method = "seed()J", cancellable = true)
    private void seed_1632873704(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1632873704L))
            info.setReturnValue(5208846185911824424L);
    }

    @Inject(at = @At("HEAD"), method = "parseSeed(Ljava/lang/String;)Ljava/util/OptionalLong;", cancellable = true)
    private static void parseSeed__253914986(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-253914986L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "generateBonusChest()Z", cancellable = true)
    private void generateBonusChest_1147909554(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1147909554L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "withBonusChest(Z)Lnet/minecraft/world/level/levelgen/WorldOptions;", cancellable = true)
    private void withBonusChest__2145733547(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2145733547L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "withStructures(Z)Lnet/minecraft/world/level/levelgen/WorldOptions;", cancellable = true)
    private void withStructures__1608218349(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1608218349L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isOldCustomizedWorld()Z", cancellable = true)
    private void isOldCustomizedWorld__701925355(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-701925355L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "testWorldWithRandomSeed()Lnet/minecraft/world/level/levelgen/WorldOptions;", cancellable = true)
    private static void testWorldWithRandomSeed_257748609(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(257748609L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "defaultWithRandomSeed()Lnet/minecraft/world/level/levelgen/WorldOptions;", cancellable = true)
    private static void defaultWithRandomSeed_710021824(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(710021824L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "withSeed(Ljava/util/OptionalLong;)Lnet/minecraft/world/level/levelgen/WorldOptions;", cancellable = true)
    private void withSeed_1588082143(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1588082143L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "generateStructures()Z", cancellable = true)
    private void generateStructures__1161880268(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1161880268L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "randomSeed()J", cancellable = true)
    private static void randomSeed__2119920547(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2119920547L))
            info.setReturnValue(-3173757154877237482L);
    }


}
