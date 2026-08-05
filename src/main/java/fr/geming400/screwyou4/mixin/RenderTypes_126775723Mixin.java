package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.rendertype.RenderTypes.class)
public class RenderTypes_126775723Mixin {
        @Inject(at = @At("HEAD"), method = "lines()Lnet/minecraft/client/renderer/rendertype/RenderType;", cancellable = true)
    private static void lines_1211355667(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1211355667L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "text(Lnet/minecraft/resources/Identifier;)Lnet/minecraft/client/renderer/rendertype/RenderType;", cancellable = true)
    private static void text_1848687259(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1848687259L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "entityCutout(Lnet/minecraft/resources/Identifier;Z)Lnet/minecraft/client/renderer/rendertype/RenderType;", cancellable = true)
    private static void entityCutout_1036605845(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1036605845L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "entityCutout(Lnet/minecraft/resources/Identifier;)Lnet/minecraft/client/renderer/rendertype/RenderType;", cancellable = true)
    private static void entityCutout_1848687259(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1848687259L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "entityCutoutCull(Lnet/minecraft/resources/Identifier;)Lnet/minecraft/client/renderer/rendertype/RenderType;", cancellable = true)
    private static void entityCutoutCull_1848687259(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1848687259L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "secondaryBlockOutline()Lnet/minecraft/client/renderer/rendertype/RenderType;", cancellable = true)
    private static void secondaryBlockOutline_1211355667(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1211355667L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "blockScreenEffect(Lnet/minecraft/resources/Identifier;)Lnet/minecraft/client/renderer/rendertype/RenderType;", cancellable = true)
    private static void blockScreenEffect_1848687259(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1848687259L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "fireScreenEffect(Lnet/minecraft/resources/Identifier;)Lnet/minecraft/client/renderer/rendertype/RenderType;", cancellable = true)
    private static void fireScreenEffect_1848687259(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1848687259L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "armorCutoutNoCull(Lnet/minecraft/resources/Identifier;)Lnet/minecraft/client/renderer/rendertype/RenderType;", cancellable = true)
    private static void armorCutoutNoCull_1848687259(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1848687259L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "itemTranslucent(Lnet/minecraft/resources/Identifier;)Lnet/minecraft/client/renderer/rendertype/RenderType;", cancellable = true)
    private static void itemTranslucent_1848687259(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1848687259L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "entitySolidZOffsetForward(Lnet/minecraft/resources/Identifier;)Lnet/minecraft/client/renderer/rendertype/RenderType;", cancellable = true)
    private static void entitySolidZOffsetForward_1848687259(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1848687259L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "entityTranslucent(Lnet/minecraft/resources/Identifier;Z)Lnet/minecraft/client/renderer/rendertype/RenderType;", cancellable = true)
    private static void entityTranslucent_1036605845(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1036605845L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "entityTranslucent(Lnet/minecraft/resources/Identifier;)Lnet/minecraft/client/renderer/rendertype/RenderType;", cancellable = true)
    private static void entityTranslucent_1848687259(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1848687259L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "itemCutout(Lnet/minecraft/resources/Identifier;)Lnet/minecraft/client/renderer/rendertype/RenderType;", cancellable = true)
    private static void itemCutout_1848687259(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1848687259L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "waterMask()Lnet/minecraft/client/renderer/rendertype/RenderType;", cancellable = true)
    private static void waterMask_1211355667(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1211355667L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "beaconBeam(Lnet/minecraft/resources/Identifier;Z)Lnet/minecraft/client/renderer/rendertype/RenderType;", cancellable = true)
    private static void beaconBeam_1036605845(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1036605845L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "endPortal()Lnet/minecraft/client/renderer/rendertype/RenderType;", cancellable = true)
    private static void endPortal_1211355667(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1211355667L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "endGateway()Lnet/minecraft/client/renderer/rendertype/RenderType;", cancellable = true)
    private static void endGateway_1211355667(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1211355667L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "dragonRays()Lnet/minecraft/client/renderer/rendertype/RenderType;", cancellable = true)
    private static void dragonRays_1211355667(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1211355667L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "breezeWind(Lnet/minecraft/resources/Identifier;FF)Lnet/minecraft/client/renderer/rendertype/RenderType;", cancellable = true)
    private static void breezeWind_1865291611(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1865291611L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "breezeEyes(Lnet/minecraft/resources/Identifier;)Lnet/minecraft/client/renderer/rendertype/RenderType;", cancellable = true)
    private static void breezeEyes_1848687259(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1848687259L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "textBackgroundSeeThrough()Lnet/minecraft/client/renderer/rendertype/RenderType;", cancellable = true)
    private static void textBackgroundSeeThrough_1211355667(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1211355667L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "textBackground()Lnet/minecraft/client/renderer/rendertype/RenderType;", cancellable = true)
    private static void textBackground_1211355667(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1211355667L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "entityCutoutDissolve(Lnet/minecraft/resources/Identifier;Lnet/minecraft/resources/Identifier;)Lnet/minecraft/client/renderer/rendertype/RenderType;", cancellable = true)
    private static void entityCutoutDissolve__821952733(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-821952733L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "endCrystalBeam(Lnet/minecraft/resources/Identifier;)Lnet/minecraft/client/renderer/rendertype/RenderType;", cancellable = true)
    private static void endCrystalBeam_1848687259(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1848687259L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "entityGlint()Lnet/minecraft/client/renderer/rendertype/RenderType;", cancellable = true)
    private static void entityGlint_1211355667(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1211355667L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "entityTranslucentEmissive(Lnet/minecraft/resources/Identifier;)Lnet/minecraft/client/renderer/rendertype/RenderType;", cancellable = true)
    private static void entityTranslucentEmissive_1848687259(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1848687259L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "entityTranslucentEmissive(Lnet/minecraft/resources/Identifier;Z)Lnet/minecraft/client/renderer/rendertype/RenderType;", cancellable = true)
    private static void entityTranslucentEmissive_1036605845(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1036605845L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "energySwirl(Lnet/minecraft/resources/Identifier;FF)Lnet/minecraft/client/renderer/rendertype/RenderType;", cancellable = true)
    private static void energySwirl_1865291611(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1865291611L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "armorEntityGlint()Lnet/minecraft/client/renderer/rendertype/RenderType;", cancellable = true)
    private static void armorEntityGlint_1211355667(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1211355667L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "armorTranslucent(Lnet/minecraft/resources/Identifier;)Lnet/minecraft/client/renderer/rendertype/RenderType;", cancellable = true)
    private static void armorTranslucent_1848687259(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1848687259L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "linesTranslucent()Lnet/minecraft/client/renderer/rendertype/RenderType;", cancellable = true)
    private static void linesTranslucent_1211355667(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1211355667L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "debugFilledBox()Lnet/minecraft/client/renderer/rendertype/RenderType;", cancellable = true)
    private static void debugFilledBox_1211355667(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1211355667L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "glintTranslucent()Lnet/minecraft/client/renderer/rendertype/RenderType;", cancellable = true)
    private static void glintTranslucent_1211355667(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1211355667L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "cutoutMovingBlock()Lnet/minecraft/client/renderer/rendertype/RenderType;", cancellable = true)
    private static void cutoutMovingBlock_1211355667(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1211355667L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "entityShadow(Lnet/minecraft/resources/Identifier;)Lnet/minecraft/client/renderer/rendertype/RenderType;", cancellable = true)
    private static void entityShadow_1848687259(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1848687259L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "translucentMovingBlock()Lnet/minecraft/client/renderer/rendertype/RenderType;", cancellable = true)
    private static void translucentMovingBlock_1211355667(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1211355667L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "solidMovingBlock()Lnet/minecraft/client/renderer/rendertype/RenderType;", cancellable = true)
    private static void solidMovingBlock_1211355667(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1211355667L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createArmorDecalCutoutNoCull(Lnet/minecraft/resources/Identifier;)Lnet/minecraft/client/renderer/rendertype/RenderType;", cancellable = true)
    private static void createArmorDecalCutoutNoCull_1848687259(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1848687259L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "debugQuads()Lnet/minecraft/client/renderer/rendertype/RenderType;", cancellable = true)
    private static void debugQuads_1211355667(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1211355667L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "entityTranslucentCullItemTarget(Lnet/minecraft/resources/Identifier;)Lnet/minecraft/client/renderer/rendertype/RenderType;", cancellable = true)
    private static void entityTranslucentCullItemTarget_1848687259(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1848687259L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "entityCutoutZOffset(Lnet/minecraft/resources/Identifier;Z)Lnet/minecraft/client/renderer/rendertype/RenderType;", cancellable = true)
    private static void entityCutoutZOffset_1036605845(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1036605845L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "entityCutoutZOffset(Lnet/minecraft/resources/Identifier;)Lnet/minecraft/client/renderer/rendertype/RenderType;", cancellable = true)
    private static void entityCutoutZOffset_1848687259(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1848687259L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "entitySolid(Lnet/minecraft/resources/Identifier;)Lnet/minecraft/client/renderer/rendertype/RenderType;", cancellable = true)
    private static void entitySolid_1848687259(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1848687259L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "lightning()Lnet/minecraft/client/renderer/rendertype/RenderType;", cancellable = true)
    private static void lightning_1211355667(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1211355667L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "leash()Lnet/minecraft/client/renderer/rendertype/RenderType;", cancellable = true)
    private static void leash_1211355667(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1211355667L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "eyes(Lnet/minecraft/resources/Identifier;)Lnet/minecraft/client/renderer/rendertype/RenderType;", cancellable = true)
    private static void eyes_1848687259(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1848687259L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "textPolygonOffset(Lnet/minecraft/resources/Identifier;)Lnet/minecraft/client/renderer/rendertype/RenderType;", cancellable = true)
    private static void textPolygonOffset_1848687259(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1848687259L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "textGrayscale(Lnet/minecraft/resources/Identifier;)Lnet/minecraft/client/renderer/rendertype/RenderType;", cancellable = true)
    private static void textGrayscale_1848687259(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1848687259L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "textSeeThrough(Lnet/minecraft/resources/Identifier;)Lnet/minecraft/client/renderer/rendertype/RenderType;", cancellable = true)
    private static void textSeeThrough_1848687259(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1848687259L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "textGrayscaleSeeThrough(Lnet/minecraft/resources/Identifier;)Lnet/minecraft/client/renderer/rendertype/RenderType;", cancellable = true)
    private static void textGrayscaleSeeThrough_1848687259(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1848687259L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "textGrayscalePolygonOffset(Lnet/minecraft/resources/Identifier;)Lnet/minecraft/client/renderer/rendertype/RenderType;", cancellable = true)
    private static void textGrayscalePolygonOffset_1848687259(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1848687259L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "debugTriangleFan()Lnet/minecraft/client/renderer/rendertype/RenderType;", cancellable = true)
    private static void debugTriangleFan_1211355667(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1211355667L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "bannerPattern(Lnet/minecraft/resources/Identifier;)Lnet/minecraft/client/renderer/rendertype/RenderType;", cancellable = true)
    private static void bannerPattern_1848687259(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1848687259L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "debugPoint()Lnet/minecraft/client/renderer/rendertype/RenderType;", cancellable = true)
    private static void debugPoint_1211355667(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1211355667L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "glint()Lnet/minecraft/client/renderer/rendertype/RenderType;", cancellable = true)
    private static void glint_1211355667(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1211355667L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "crumbling(Lnet/minecraft/resources/Identifier;)Lnet/minecraft/client/renderer/rendertype/RenderType;", cancellable = true)
    private static void crumbling_1848687259(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1848687259L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "outline(Lnet/minecraft/resources/Identifier;)Lnet/minecraft/client/renderer/rendertype/RenderType;", cancellable = true)
    private static void outline_1848687259(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1848687259L))
            info.setReturnValue(null);
    }


}
