package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.NoiseRouterData.class)
public class NoiseRouterData_511030433Mixin {
        @Inject(at = @At("HEAD"), method = "end(Lnet/minecraft/core/HolderGetter;)Lnet/minecraft/world/level/levelgen/NoiseRouter;", cancellable = true)
    private static void end__830256565(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-830256565L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getFunction(Lnet/minecraft/core/HolderGetter;Lnet/minecraft/resources/ResourceKey;)Lnet/minecraft/world/level/levelgen/DensityFunction;", cancellable = true)
    private static void getFunction_1177032347(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1177032347L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "bootstrap(Lnet/minecraft/data/worldgen/BootstrapContext;)Lnet/minecraft/core/Holder;", cancellable = true)
    private static void bootstrap_871487828(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(871487828L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "none()Lnet/minecraft/world/level/levelgen/NoiseRouter;", cancellable = true)
    private static void none_980385922(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(980385922L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "preliminarySurfaceLevel(Lnet/minecraft/world/level/levelgen/DensityFunction;Lnet/minecraft/world/level/levelgen/DensityFunction;Z)Lnet/minecraft/world/level/levelgen/DensityFunction;", cancellable = true)
    private static void preliminarySurfaceLevel__983769758(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-983769758L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "underground(Lnet/minecraft/core/HolderGetter;Lnet/minecraft/core/HolderGetter;Lnet/minecraft/world/level/levelgen/DensityFunction;)Lnet/minecraft/world/level/levelgen/DensityFunction;", cancellable = true)
    private static void underground_1822278070(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1822278070L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "peaksAndValleys(Lnet/minecraft/world/level/levelgen/DensityFunction;)Lnet/minecraft/world/level/levelgen/DensityFunction;", cancellable = true)
    private static void peaksAndValleys__610701752(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-610701752L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "peaksAndValleys(F)F", cancellable = true)
    private static void peaksAndValleys_31176482(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(31176482L))
            info.setReturnValue(5.80196E7F);
    }

    @Inject(at = @At("HEAD"), method = "nether(Lnet/minecraft/core/HolderGetter;Lnet/minecraft/core/HolderGetter;)Lnet/minecraft/world/level/levelgen/NoiseRouter;", cancellable = true)
    private static void nether_1113686818(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1113686818L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "postProcess(Lnet/minecraft/world/level/levelgen/DensityFunction;)Lnet/minecraft/world/level/levelgen/DensityFunction;", cancellable = true)
    private static void postProcess_1490246(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1490246L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "overworld(Lnet/minecraft/core/HolderGetter;Lnet/minecraft/core/HolderGetter;ZZ)Lnet/minecraft/world/level/levelgen/NoiseRouter;", cancellable = true)
    private static void overworld__226573112(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-226573112L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "floatingIslands(Lnet/minecraft/core/HolderGetter;Lnet/minecraft/core/HolderGetter;)Lnet/minecraft/world/level/levelgen/NoiseRouter;", cancellable = true)
    private static void floatingIslands_969601250(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(969601250L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "slide(Lnet/minecraft/world/level/levelgen/DensityFunction;IIIIDIID)Lnet/minecraft/world/level/levelgen/DensityFunction;", cancellable = true)
    private static void slide_586850472(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(586850472L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "caves(Lnet/minecraft/core/HolderGetter;)Lnet/minecraft/world/level/levelgen/NoiseRouter;", cancellable = true)
    private static void caves_1985576320(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1985576320L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "pillars(Lnet/minecraft/core/HolderGetter;)Lnet/minecraft/world/level/levelgen/DensityFunction;", cancellable = true)
    private static void pillars__996685088(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-996685088L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "entrances(Lnet/minecraft/core/HolderGetter;Lnet/minecraft/core/HolderGetter;)Lnet/minecraft/world/level/levelgen/DensityFunction;", cancellable = true)
    private static void entrances_1039564298(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1039564298L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "noodle(Lnet/minecraft/core/HolderGetter;Lnet/minecraft/core/HolderGetter;)Lnet/minecraft/world/level/levelgen/DensityFunction;", cancellable = true)
    private static void noodle_448321116(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(448321116L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "slideEnd(Lnet/minecraft/world/level/levelgen/DensityFunction;)Lnet/minecraft/world/level/levelgen/DensityFunction;", cancellable = true)
    private static void slideEnd__436340607(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-436340607L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "spaghettiRoughnessFunction(Lnet/minecraft/core/HolderGetter;)Lnet/minecraft/world/level/levelgen/DensityFunction;", cancellable = true)
    private static void spaghettiRoughnessFunction_67831562(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(67831562L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "registerTerrainNoises(Lnet/minecraft/data/worldgen/BootstrapContext;Lnet/minecraft/core/HolderGetter;Lnet/minecraft/world/level/levelgen/DensityFunction;Lnet/minecraft/world/level/levelgen/DensityFunction;Lnet/minecraft/world/level/levelgen/DensityFunction;Lnet/minecraft/resources/ResourceKey;Lnet/minecraft/resources/ResourceKey;Lnet/minecraft/resources/ResourceKey;Lnet/minecraft/resources/ResourceKey;Lnet/minecraft/resources/ResourceKey;Z)V", cancellable = true)
    private static void registerTerrainNoises__1636394348(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1636394348L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "noiseGradientDensity(Lnet/minecraft/world/level/levelgen/DensityFunction;Lnet/minecraft/world/level/levelgen/DensityFunction;)Lnet/minecraft/world/level/levelgen/DensityFunction;", cancellable = true)
    private static void noiseGradientDensity_1982974975(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1982974975L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "spaghetti2D(Lnet/minecraft/core/HolderGetter;Lnet/minecraft/core/HolderGetter;)Lnet/minecraft/world/level/levelgen/DensityFunction;", cancellable = true)
    private static void spaghetti2D__1315370360(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1315370360L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "splineWithBlending(Lnet/minecraft/world/level/levelgen/DensityFunction;Lnet/minecraft/world/level/levelgen/DensityFunction;)Lnet/minecraft/world/level/levelgen/DensityFunction;", cancellable = true)
    private static void splineWithBlending__733467095(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-733467095L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "offsetToDepth(Lnet/minecraft/world/level/levelgen/DensityFunction;)Lnet/minecraft/world/level/levelgen/DensityFunction;", cancellable = true)
    private static void offsetToDepth_1757031308(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1757031308L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "registerAndWrap(Lnet/minecraft/data/worldgen/BootstrapContext;Lnet/minecraft/resources/ResourceKey;Lnet/minecraft/world/level/levelgen/DensityFunction;)Lnet/minecraft/world/level/levelgen/DensityFunction;", cancellable = true)
    private static void registerAndWrap__663461213(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-663461213L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "yLimitedInterpolatable(Lnet/minecraft/world/level/levelgen/DensityFunction;Lnet/minecraft/world/level/levelgen/DensityFunction;III)Lnet/minecraft/world/level/levelgen/DensityFunction;", cancellable = true)
    private static void yLimitedInterpolatable__122240415(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-122240415L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "slideNetherLike(Lnet/minecraft/core/HolderGetter;II)Lnet/minecraft/world/level/levelgen/DensityFunction;", cancellable = true)
    private static void slideNetherLike_1954308745(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1954308745L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "slideOverworld(ZLnet/minecraft/world/level/levelgen/DensityFunction;)Lnet/minecraft/world/level/levelgen/DensityFunction;", cancellable = true)
    private static void slideOverworld__1824765088(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1824765088L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "slideEndLike(Lnet/minecraft/world/level/levelgen/DensityFunction;II)Lnet/minecraft/world/level/levelgen/DensityFunction;", cancellable = true)
    private static void slideEndLike_135435992(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(135435992L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "simpleRouter(Lnet/minecraft/world/level/levelgen/DensityFunction;)Lnet/minecraft/world/level/levelgen/NoiseRouter;", cancellable = true)
    private static void simpleRouter__1906126673(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1906126673L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "remap(Lnet/minecraft/world/level/levelgen/DensityFunction;DDDD)Lnet/minecraft/world/level/levelgen/DensityFunction;", cancellable = true)
    private static void remap_671485024(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(671485024L))
            info.setReturnValue(null);
    }


}
