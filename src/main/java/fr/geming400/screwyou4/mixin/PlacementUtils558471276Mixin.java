package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.data.worldgen.placement.PlacementUtils.class)
public class PlacementUtils558471276Mixin {
        @Inject(at = @At("HEAD"), method = "isEmpty()Lnet/minecraft/world/level/levelgen/placement/PlacementFilter;", cancellable = true)
    private static void isEmpty__316943607(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-316943607L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "register(Lnet/minecraft/data/worldgen/BootstrapContext;Lnet/minecraft/resources/ResourceKey;Lnet/minecraft/core/Holder;[Lnet/minecraft/world/level/levelgen/placement/PlacementModifier;)V", cancellable = true)
    private static void register__508023408(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-508023408L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "register(Lnet/minecraft/data/worldgen/BootstrapContext;Lnet/minecraft/resources/ResourceKey;Lnet/minecraft/core/Holder;Ljava/util/List;)V", cancellable = true)
    private static void register__1430281986(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1430281986L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "bootstrap(Lnet/minecraft/data/worldgen/BootstrapContext;)V", cancellable = true)
    private static void bootstrap_3865559(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(3865559L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "filtered(Lnet/minecraft/world/level/levelgen/feature/Feature;Lnet/minecraft/world/level/levelgen/feature/configurations/FeatureConfiguration;Lnet/minecraft/world/level/levelgen/blockpredicates/BlockPredicate;)Lnet/minecraft/core/Holder;", cancellable = true)
    private static void filtered_1843149729(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1843149729L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "countExtra(IFI)Lnet/minecraft/world/level/levelgen/placement/PlacementModifier;", cancellable = true)
    private static void countExtra_11390762(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(11390762L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createKey(Ljava/lang/String;)Lnet/minecraft/resources/ResourceKey;", cancellable = true)
    private static void createKey__1662777348(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1662777348L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "inlinePlaced(Lnet/minecraft/world/level/levelgen/feature/Feature;Lnet/minecraft/world/level/levelgen/feature/configurations/FeatureConfiguration;[Lnet/minecraft/world/level/levelgen/placement/PlacementModifier;)Lnet/minecraft/core/Holder;", cancellable = true)
    private static void inlinePlaced_243167695(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(243167695L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "inlinePlaced(Lnet/minecraft/core/Holder;[Lnet/minecraft/world/level/levelgen/placement/PlacementModifier;)Lnet/minecraft/core/Holder;", cancellable = true)
    private static void inlinePlaced_447832682(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(447832682L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "filteredByBlockSurvival(Lnet/minecraft/world/level/block/Block;)Lnet/minecraft/world/level/levelgen/placement/BlockPredicateFilter;", cancellable = true)
    private static void filteredByBlockSurvival__343885990(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-343885990L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "onlyWhenEmpty(Lnet/minecraft/world/level/levelgen/feature/Feature;Lnet/minecraft/world/level/levelgen/feature/configurations/FeatureConfiguration;)Lnet/minecraft/core/Holder;", cancellable = true)
    private static void onlyWhenEmpty__1404530737(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1404530737L))
            info.setReturnValue(null);
    }


}
