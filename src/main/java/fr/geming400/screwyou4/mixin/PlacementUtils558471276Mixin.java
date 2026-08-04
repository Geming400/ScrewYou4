package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.data.worldgen.placement.PlacementUtils.class)
public class PlacementUtils558471276Mixin {
        @Inject(at = @At("HEAD"), method = "isEmpty()Lnet/minecraft/world/level/levelgen/placement/PlacementFilter;", cancellable = true)
    private static void isEmpty__77480570(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-77480570L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "register(Lnet/minecraft/data/worldgen/BootstrapContext;Lnet/minecraft/resources/ResourceKey;Lnet/minecraft/core/Holder;[Lnet/minecraft/world/level/levelgen/placement/PlacementModifier;)V", cancellable = true)
    private static void register__609408403(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-609408403L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "register(Lnet/minecraft/data/worldgen/BootstrapContext;Lnet/minecraft/resources/ResourceKey;Lnet/minecraft/core/Holder;Ljava/util/List;)V", cancellable = true)
    private static void register_307054209(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(307054209L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "bootstrap(Lnet/minecraft/data/worldgen/BootstrapContext;)V", cancellable = true)
    private static void bootstrap__634047227(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-634047227L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "filtered(Lnet/minecraft/world/level/levelgen/feature/Feature;Lnet/minecraft/world/level/levelgen/feature/configurations/FeatureConfiguration;Lnet/minecraft/world/level/levelgen/blockpredicates/BlockPredicate;)Lnet/minecraft/core/Holder;", cancellable = true)
    private static void filtered_441209546(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(441209546L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createKey(Ljava/lang/String;)Lnet/minecraft/resources/ResourceKey;", cancellable = true)
    private static void createKey__1244524129(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1244524129L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "onlyWhenEmpty(Lnet/minecraft/world/level/levelgen/feature/Feature;Lnet/minecraft/world/level/levelgen/feature/configurations/FeatureConfiguration;)Lnet/minecraft/core/Holder;", cancellable = true)
    private static void onlyWhenEmpty_741237014(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(741237014L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "filteredByBlockSurvival(Lnet/minecraft/world/level/block/Block;)Lnet/minecraft/world/level/levelgen/placement/BlockPredicateFilter;", cancellable = true)
    private static void filteredByBlockSurvival__1301228195(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1301228195L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "inlinePlaced(Lnet/minecraft/world/level/levelgen/feature/Feature;Lnet/minecraft/world/level/levelgen/feature/configurations/FeatureConfiguration;[Lnet/minecraft/world/level/levelgen/placement/PlacementModifier;)Lnet/minecraft/core/Holder;", cancellable = true)
    private static void inlinePlaced_496837785(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(496837785L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "inlinePlaced(Lnet/minecraft/core/Holder;[Lnet/minecraft/world/level/levelgen/placement/PlacementModifier;)Lnet/minecraft/core/Holder;", cancellable = true)
    private static void inlinePlaced__92631968(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-92631968L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "countExtra(IFI)Lnet/minecraft/world/level/levelgen/placement/PlacementModifier;", cancellable = true)
    private static void countExtra__1934162293(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1934162293L))
            info.setReturnValue(null);
    }


}
