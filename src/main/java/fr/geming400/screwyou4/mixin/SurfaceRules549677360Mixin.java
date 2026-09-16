package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.SurfaceRules.class)
public class SurfaceRules549677360Mixin {
        @Inject(at = @At("HEAD"), method = "state(Lnet/minecraft/world/level/block/state/BlockState;)Lnet/minecraft/world/level/levelgen/SurfaceRules$RuleSource;", cancellable = true)
    private static void state_1582382830(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1582382830L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "sequence([Lnet/minecraft/world/level/levelgen/SurfaceRules$RuleSource;)Lnet/minecraft/world/level/levelgen/SurfaceRules$RuleSource;", cancellable = true)
    private static void sequence__606772869(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-606772869L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "not(Lnet/minecraft/world/level/levelgen/SurfaceRules$ConditionSource;)Lnet/minecraft/world/level/levelgen/SurfaceRules$ConditionSource;", cancellable = true)
    private static void not__752221680(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-752221680L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hole()Lnet/minecraft/world/level/levelgen/SurfaceRules$ConditionSource;", cancellable = true)
    private static void hole__327957207(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-327957207L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "bandlands()Lnet/minecraft/world/level/levelgen/SurfaceRules$RuleSource;", cancellable = true)
    private static void bandlands_484070399(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(484070399L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isBiome(Lnet/minecraft/core/HolderGetter;[Lnet/minecraft/resources/ResourceKey;)Lnet/minecraft/world/level/levelgen/SurfaceRules$ConditionSource;", cancellable = true)
    private static void isBiome__448494756(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-448494756L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "temperature()Lnet/minecraft/world/level/levelgen/SurfaceRules$ConditionSource;", cancellable = true)
    private static void temperature_580773109(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(580773109L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "ifTrue(Lnet/minecraft/world/level/levelgen/SurfaceRules$ConditionSource;Lnet/minecraft/world/level/levelgen/SurfaceRules$RuleSource;)Lnet/minecraft/world/level/levelgen/SurfaceRules$RuleSource;", cancellable = true)
    private static void ifTrue__759748728(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-759748728L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "noiseCondition3d(Lnet/minecraft/resources/ResourceKey;D)Lnet/minecraft/world/level/levelgen/SurfaceRules$ConditionSource;", cancellable = true)
    private static void noiseCondition3d__802586585(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-802586585L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "noiseCondition3d(Lnet/minecraft/resources/ResourceKey;DD)Lnet/minecraft/world/level/levelgen/SurfaceRules$ConditionSource;", cancellable = true)
    private static void noiseCondition3d__921659809(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-921659809L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "stoneDepthCheck(IZILnet/minecraft/world/level/levelgen/placement/CaveSurface;)Lnet/minecraft/world/level/levelgen/SurfaceRules$ConditionSource;", cancellable = true)
    private static void stoneDepthCheck_148757051(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(148757051L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "stoneDepthCheck(IZLnet/minecraft/world/level/levelgen/placement/CaveSurface;)Lnet/minecraft/world/level/levelgen/SurfaceRules$ConditionSource;", cancellable = true)
    private static void stoneDepthCheck_1087947504(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1087947504L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "yBlockCheck(Lnet/minecraft/world/level/levelgen/VerticalAnchor;I)Lnet/minecraft/world/level/levelgen/SurfaceRules$ConditionSource;", cancellable = true)
    private static void yBlockCheck_871047465(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(871047465L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "noiseCondition2d(Lnet/minecraft/resources/ResourceKey;D)Lnet/minecraft/world/level/levelgen/SurfaceRules$ConditionSource;", cancellable = true)
    private static void noiseCondition2d__283294298(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-283294298L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "noiseCondition2d(Lnet/minecraft/resources/ResourceKey;DD)Lnet/minecraft/world/level/levelgen/SurfaceRules$ConditionSource;", cancellable = true)
    private static void noiseCondition2d__2003468096(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2003468096L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "waterBlockCheck(II)Lnet/minecraft/world/level/levelgen/SurfaceRules$ConditionSource;", cancellable = true)
    private static void waterBlockCheck_1886542807(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1886542807L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "yStartCheck(Lnet/minecraft/world/level/levelgen/VerticalAnchor;I)Lnet/minecraft/world/level/levelgen/SurfaceRules$ConditionSource;", cancellable = true)
    private static void yStartCheck_1383055934(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1383055934L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "waterStartCheck(II)Lnet/minecraft/world/level/levelgen/SurfaceRules$ConditionSource;", cancellable = true)
    private static void waterStartCheck_1647713324(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1647713324L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "verticalGradient(Ljava/lang/String;Lnet/minecraft/world/level/levelgen/VerticalAnchor;Lnet/minecraft/world/level/levelgen/VerticalAnchor;)Lnet/minecraft/world/level/levelgen/SurfaceRules$ConditionSource;", cancellable = true)
    private static void verticalGradient__137419955(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-137419955L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "abovePreliminarySurface()Lnet/minecraft/world/level/levelgen/SurfaceRules$ConditionSource;", cancellable = true)
    private static void abovePreliminarySurface__781715883(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-781715883L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "steep()Lnet/minecraft/world/level/levelgen/SurfaceRules$ConditionSource;", cancellable = true)
    private static void steep_1179234682(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1179234682L))
            info.setReturnValue(null);
    }


}
