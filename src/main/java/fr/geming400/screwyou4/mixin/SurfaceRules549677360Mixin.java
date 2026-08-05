package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.SurfaceRules.class)
public class SurfaceRules549677360Mixin {
        @Inject(at = @At("HEAD"), method = "state(Lnet/minecraft/world/level/block/state/BlockState;)Lnet/minecraft/world/level/levelgen/SurfaceRules$RuleSource;", cancellable = true)
    private static void state__1408325475(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1408325475L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "sequence([Lnet/minecraft/world/level/levelgen/SurfaceRules$RuleSource;)Lnet/minecraft/world/level/levelgen/SurfaceRules$RuleSource;", cancellable = true)
    private static void sequence_1132382620(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1132382620L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "not(Lnet/minecraft/world/level/levelgen/SurfaceRules$ConditionSource;)Lnet/minecraft/world/level/levelgen/SurfaceRules$ConditionSource;", cancellable = true)
    private static void not_606679421(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(606679421L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isBiome(Lnet/minecraft/core/HolderGetter;[Lnet/minecraft/resources/ResourceKey;)Lnet/minecraft/world/level/levelgen/SurfaceRules$ConditionSource;", cancellable = true)
    private static void isBiome_2035711686(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2035711686L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "steep()Lnet/minecraft/world/level/levelgen/SurfaceRules$ConditionSource;", cancellable = true)
    private static void steep_1245954537(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1245954537L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "bandlands()Lnet/minecraft/world/level/levelgen/SurfaceRules$RuleSource;", cancellable = true)
    private static void bandlands__826004180(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-826004180L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hole()Lnet/minecraft/world/level/levelgen/SurfaceRules$ConditionSource;", cancellable = true)
    private static void hole_1245954537(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1245954537L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "temperature()Lnet/minecraft/world/level/levelgen/SurfaceRules$ConditionSource;", cancellable = true)
    private static void temperature_1245954537(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1245954537L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "ifTrue(Lnet/minecraft/world/level/levelgen/SurfaceRules$ConditionSource;Lnet/minecraft/world/level/levelgen/SurfaceRules$RuleSource;)Lnet/minecraft/world/level/levelgen/SurfaceRules$RuleSource;", cancellable = true)
    private static void ifTrue_1480123379(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1480123379L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "noiseCondition2d(Lnet/minecraft/resources/ResourceKey;DD)Lnet/minecraft/world/level/levelgen/SurfaceRules$ConditionSource;", cancellable = true)
    private static void noiseCondition2d_672367597(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(672367597L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "noiseCondition2d(Lnet/minecraft/resources/ResourceKey;D)Lnet/minecraft/world/level/levelgen/SurfaceRules$ConditionSource;", cancellable = true)
    private static void noiseCondition2d__1720997671(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1720997671L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "stoneDepthCheck(IZILnet/minecraft/world/level/levelgen/placement/CaveSurface;)Lnet/minecraft/world/level/levelgen/SurfaceRules$ConditionSource;", cancellable = true)
    private static void stoneDepthCheck__908321167(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-908321167L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "stoneDepthCheck(IZLnet/minecraft/world/level/levelgen/placement/CaveSurface;)Lnet/minecraft/world/level/levelgen/SurfaceRules$ConditionSource;", cancellable = true)
    private static void stoneDepthCheck_361111546(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(361111546L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "yStartCheck(Lnet/minecraft/world/level/levelgen/VerticalAnchor;I)Lnet/minecraft/world/level/levelgen/SurfaceRules$ConditionSource;", cancellable = true)
    private static void yStartCheck__1657891715(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1657891715L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "yBlockCheck(Lnet/minecraft/world/level/levelgen/VerticalAnchor;I)Lnet/minecraft/world/level/levelgen/SurfaceRules$ConditionSource;", cancellable = true)
    private static void yBlockCheck__1657891715(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1657891715L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "verticalGradient(Ljava/lang/String;Lnet/minecraft/world/level/levelgen/VerticalAnchor;Lnet/minecraft/world/level/levelgen/VerticalAnchor;)Lnet/minecraft/world/level/levelgen/SurfaceRules$ConditionSource;", cancellable = true)
    private static void verticalGradient__225846701(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-225846701L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "abovePreliminarySurface()Lnet/minecraft/world/level/levelgen/SurfaceRules$ConditionSource;", cancellable = true)
    private static void abovePreliminarySurface_1245954537(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1245954537L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "noiseCondition3d(Lnet/minecraft/resources/ResourceKey;DD)Lnet/minecraft/world/level/levelgen/SurfaceRules$ConditionSource;", cancellable = true)
    private static void noiseCondition3d_672367597(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(672367597L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "noiseCondition3d(Lnet/minecraft/resources/ResourceKey;D)Lnet/minecraft/world/level/levelgen/SurfaceRules$ConditionSource;", cancellable = true)
    private static void noiseCondition3d__1720997671(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1720997671L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "waterBlockCheck(II)Lnet/minecraft/world/level/levelgen/SurfaceRules$ConditionSource;", cancellable = true)
    private static void waterBlockCheck_479645961(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(479645961L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "waterStartCheck(II)Lnet/minecraft/world/level/levelgen/SurfaceRules$ConditionSource;", cancellable = true)
    private static void waterStartCheck_479645961(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(479645961L))
            info.setReturnValue(null);
    }


}
