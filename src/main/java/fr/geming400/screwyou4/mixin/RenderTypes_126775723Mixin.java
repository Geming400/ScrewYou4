package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.rendertype.RenderTypes.class)
public class RenderTypes_126775723Mixin {
        @Inject(at = @At("HEAD"), method = "lines()Lnet/minecraft/client/renderer/rendertype/RenderType;", cancellable = true)
    private static void lines__928625676(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-928625676L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "text(Lnet/minecraft/resources/Identifier;)Lnet/minecraft/client/renderer/rendertype/RenderType;", cancellable = true)
    private static void text__1536317298(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1536317298L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "textBackground()Lnet/minecraft/client/renderer/rendertype/RenderType;", cancellable = true)
    private static void textBackground_1176028216(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1176028216L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "textBackgroundSeeThrough()Lnet/minecraft/client/renderer/rendertype/RenderType;", cancellable = true)
    private static void textBackgroundSeeThrough__1068872922(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1068872922L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "endCrystalBeam(Lnet/minecraft/resources/Identifier;)Lnet/minecraft/client/renderer/rendertype/RenderType;", cancellable = true)
    private static void endCrystalBeam__1757078863(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1757078863L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "entityCutoutDissolve(Lnet/minecraft/resources/Identifier;Lnet/minecraft/resources/Identifier;)Lnet/minecraft/client/renderer/rendertype/RenderType;", cancellable = true)
    private static void entityCutoutDissolve_986311171(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(986311171L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "entityTranslucentEmissive(Lnet/minecraft/resources/Identifier;)Lnet/minecraft/client/renderer/rendertype/RenderType;", cancellable = true)
    private static void entityTranslucentEmissive_1571494350(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1571494350L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "entityTranslucentEmissive(Lnet/minecraft/resources/Identifier;Z)Lnet/minecraft/client/renderer/rendertype/RenderType;", cancellable = true)
    private static void entityTranslucentEmissive_1033560258(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1033560258L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "entityGlint()Lnet/minecraft/client/renderer/rendertype/RenderType;", cancellable = true)
    private static void entityGlint_413418796(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(413418796L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "energySwirl(Lnet/minecraft/resources/Identifier;FF)Lnet/minecraft/client/renderer/rendertype/RenderType;", cancellable = true)
    private static void energySwirl__202218844(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-202218844L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "armorEntityGlint()Lnet/minecraft/client/renderer/rendertype/RenderType;", cancellable = true)
    private static void armorEntityGlint__723326197(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-723326197L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "armorTranslucent(Lnet/minecraft/resources/Identifier;)Lnet/minecraft/client/renderer/rendertype/RenderType;", cancellable = true)
    private static void armorTranslucent_28602433(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(28602433L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "linesTranslucent()Lnet/minecraft/client/renderer/rendertype/RenderType;", cancellable = true)
    private static void linesTranslucent__964136839(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-964136839L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "debugFilledBox()Lnet/minecraft/client/renderer/rendertype/RenderType;", cancellable = true)
    private static void debugFilledBox__341266723(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-341266723L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "glintTranslucent()Lnet/minecraft/client/renderer/rendertype/RenderType;", cancellable = true)
    private static void glintTranslucent__343441180(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-343441180L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "cutoutMovingBlock()Lnet/minecraft/client/renderer/rendertype/RenderType;", cancellable = true)
    private static void cutoutMovingBlock__1371568640(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1371568640L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "translucentMovingBlock()Lnet/minecraft/client/renderer/rendertype/RenderType;", cancellable = true)
    private static void translucentMovingBlock__738713331(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-738713331L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "solidMovingBlock()Lnet/minecraft/client/renderer/rendertype/RenderType;", cancellable = true)
    private static void solidMovingBlock__236896417(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-236896417L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "entityShadow(Lnet/minecraft/resources/Identifier;)Lnet/minecraft/client/renderer/rendertype/RenderType;", cancellable = true)
    private static void entityShadow__1688719720(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1688719720L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "crumbling(Lnet/minecraft/resources/Identifier;)Lnet/minecraft/client/renderer/rendertype/RenderType;", cancellable = true)
    private static void crumbling_1516411850(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1516411850L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "entityCutoutZOffset(Lnet/minecraft/resources/Identifier;)Lnet/minecraft/client/renderer/rendertype/RenderType;", cancellable = true)
    private static void entityCutoutZOffset__603989955(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-603989955L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "entityCutoutZOffset(Lnet/minecraft/resources/Identifier;Z)Lnet/minecraft/client/renderer/rendertype/RenderType;", cancellable = true)
    private static void entityCutoutZOffset__1981943757(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1981943757L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "entitySolid(Lnet/minecraft/resources/Identifier;)Lnet/minecraft/client/renderer/rendertype/RenderType;", cancellable = true)
    private static void entitySolid__678994157(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-678994157L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "itemCutout(Lnet/minecraft/resources/Identifier;)Lnet/minecraft/client/renderer/rendertype/RenderType;", cancellable = true)
    private static void itemCutout_689308732(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(689308732L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "waterMask()Lnet/minecraft/client/renderer/rendertype/RenderType;", cancellable = true)
    private static void waterMask_1053830864(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1053830864L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "secondaryBlockOutline()Lnet/minecraft/client/renderer/rendertype/RenderType;", cancellable = true)
    private static void secondaryBlockOutline__953866326(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-953866326L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "debugQuads()Lnet/minecraft/client/renderer/rendertype/RenderType;", cancellable = true)
    private static void debugQuads__983375174(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-983375174L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "eyes(Lnet/minecraft/resources/Identifier;)Lnet/minecraft/client/renderer/rendertype/RenderType;", cancellable = true)
    private static void eyes__1780596359(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1780596359L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "lightning()Lnet/minecraft/client/renderer/rendertype/RenderType;", cancellable = true)
    private static void lightning_1728446089(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1728446089L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "leash()Lnet/minecraft/client/renderer/rendertype/RenderType;", cancellable = true)
    private static void leash_1818208854(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1818208854L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "entityTranslucent(Lnet/minecraft/resources/Identifier;)Lnet/minecraft/client/renderer/rendertype/RenderType;", cancellable = true)
    private static void entityTranslucent__1519362331(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1519362331L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "entityTranslucent(Lnet/minecraft/resources/Identifier;Z)Lnet/minecraft/client/renderer/rendertype/RenderType;", cancellable = true)
    private static void entityTranslucent__293716341(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-293716341L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createArmorDecalCutoutNoCull(Lnet/minecraft/resources/Identifier;)Lnet/minecraft/client/renderer/rendertype/RenderType;", cancellable = true)
    private static void createArmorDecalCutoutNoCull_50913938(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(50913938L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "entityTranslucentCullItemTarget(Lnet/minecraft/resources/Identifier;)Lnet/minecraft/client/renderer/rendertype/RenderType;", cancellable = true)
    private static void entityTranslucentCullItemTarget__1201855633(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1201855633L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "glint()Lnet/minecraft/client/renderer/rendertype/RenderType;", cancellable = true)
    private static void glint_403525737(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(403525737L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "beaconBeam(Lnet/minecraft/resources/Identifier;Z)Lnet/minecraft/client/renderer/rendertype/RenderType;", cancellable = true)
    private static void beaconBeam__1485557656(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1485557656L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "endPortal()Lnet/minecraft/client/renderer/rendertype/RenderType;", cancellable = true)
    private static void endPortal__502445364(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-502445364L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "endGateway()Lnet/minecraft/client/renderer/rendertype/RenderType;", cancellable = true)
    private static void endGateway__898423478(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-898423478L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "dragonRays()Lnet/minecraft/client/renderer/rendertype/RenderType;", cancellable = true)
    private static void dragonRays_992132951(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(992132951L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "breezeWind(Lnet/minecraft/resources/Identifier;FF)Lnet/minecraft/client/renderer/rendertype/RenderType;", cancellable = true)
    private static void breezeWind_1941971000(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1941971000L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "breezeEyes(Lnet/minecraft/resources/Identifier;)Lnet/minecraft/client/renderer/rendertype/RenderType;", cancellable = true)
    private static void breezeEyes__780210018(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-780210018L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "debugPoint()Lnet/minecraft/client/renderer/rendertype/RenderType;", cancellable = true)
    private static void debugPoint_914891190(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(914891190L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "textGrayscaleSeeThrough(Lnet/minecraft/resources/Identifier;)Lnet/minecraft/client/renderer/rendertype/RenderType;", cancellable = true)
    private static void textGrayscaleSeeThrough__1718906513(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1718906513L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "textPolygonOffset(Lnet/minecraft/resources/Identifier;)Lnet/minecraft/client/renderer/rendertype/RenderType;", cancellable = true)
    private static void textPolygonOffset_1110086747(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1110086747L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "textGrayscalePolygonOffset(Lnet/minecraft/resources/Identifier;)Lnet/minecraft/client/renderer/rendertype/RenderType;", cancellable = true)
    private static void textGrayscalePolygonOffset_129224968(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(129224968L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "textSeeThrough(Lnet/minecraft/resources/Identifier;)Lnet/minecraft/client/renderer/rendertype/RenderType;", cancellable = true)
    private static void textSeeThrough__1009989892(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1009989892L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "textGrayscale(Lnet/minecraft/resources/Identifier;)Lnet/minecraft/client/renderer/rendertype/RenderType;", cancellable = true)
    private static void textGrayscale__81897791(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-81897791L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "debugTriangleFan()Lnet/minecraft/client/renderer/rendertype/RenderType;", cancellable = true)
    private static void debugTriangleFan__1615883909(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1615883909L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "bannerPattern(Lnet/minecraft/resources/Identifier;)Lnet/minecraft/client/renderer/rendertype/RenderType;", cancellable = true)
    private static void bannerPattern_350987863(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(350987863L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "outline(Lnet/minecraft/resources/Identifier;)Lnet/minecraft/client/renderer/rendertype/RenderType;", cancellable = true)
    private static void outline_994771353(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(994771353L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "entityCutout(Lnet/minecraft/resources/Identifier;)Lnet/minecraft/client/renderer/rendertype/RenderType;", cancellable = true)
    private static void entityCutout_2142038380(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2142038380L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "entityCutout(Lnet/minecraft/resources/Identifier;Z)Lnet/minecraft/client/renderer/rendertype/RenderType;", cancellable = true)
    private static void entityCutout_1540556004(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1540556004L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "entityCutoutCull(Lnet/minecraft/resources/Identifier;)Lnet/minecraft/client/renderer/rendertype/RenderType;", cancellable = true)
    private static void entityCutoutCull__1335693158(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1335693158L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "blockScreenEffect(Lnet/minecraft/resources/Identifier;)Lnet/minecraft/client/renderer/rendertype/RenderType;", cancellable = true)
    private static void blockScreenEffect__1269377903(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1269377903L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "fireScreenEffect(Lnet/minecraft/resources/Identifier;)Lnet/minecraft/client/renderer/rendertype/RenderType;", cancellable = true)
    private static void fireScreenEffect_1371184392(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1371184392L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "armorCutoutNoCull(Lnet/minecraft/resources/Identifier;)Lnet/minecraft/client/renderer/rendertype/RenderType;", cancellable = true)
    private static void armorCutoutNoCull__1564362563(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1564362563L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "itemTranslucent(Lnet/minecraft/resources/Identifier;)Lnet/minecraft/client/renderer/rendertype/RenderType;", cancellable = true)
    private static void itemTranslucent_915899925(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(915899925L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "entitySolidZOffsetForward(Lnet/minecraft/resources/Identifier;)Lnet/minecraft/client/renderer/rendertype/RenderType;", cancellable = true)
    private static void entitySolidZOffsetForward_840876955(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(840876955L))
            info.setReturnValue(null);
    }


}
