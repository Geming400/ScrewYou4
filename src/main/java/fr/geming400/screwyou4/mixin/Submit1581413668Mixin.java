package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.feature.ItemFeatureRenderer.Submit.class)
public class Submit1581413668Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_672787400(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(672787400L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1943130103(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1943130103L))
            info.setReturnValue("z@4\u327E\u783Ad7v6lU3(S,;*t\u595A&9> M\u9FE3eam5<XcsUa}`rrBC");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_2138765759(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2138765759L))
            info.setReturnValue(247006310);
    }

    @Inject(at = @At("HEAD"), method = "distanceToCameraSq()F", cancellable = true)
    private void distanceToCameraSq__1918086700(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1918086700L))
            info.setReturnValue(9.405003E8F);
    }

    @Inject(at = @At("HEAD"), method = "featureType()Lnet/minecraft/client/renderer/feature/FeatureRendererType;", cancellable = true)
    private void featureType_1388989914(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1388989914L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "quads()Ljava/util/List;", cancellable = true)
    private void quads__1762071200(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1762071200L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "foilType()Lnet/minecraft/client/renderer/item/ItemStackRenderState$FoilType;", cancellable = true)
    private void foilType__2005565772(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2005565772L))
            info.setReturnValue(net.minecraft.client.renderer.item.ItemStackRenderState.FoilType.NONE);
    }

    @Inject(at = @At("HEAD"), method = "tintLayers()[I", cancellable = true)
    private void tintLayers__2055120818(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2055120818L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "displayContext()Lnet/minecraft/world/item/ItemDisplayContext;", cancellable = true)
    private void displayContext__1790143952(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1790143952L))
            info.setReturnValue(net.minecraft.world.item.ItemDisplayContext.THIRD_PERSON_RIGHT_HAND);
    }

    @Inject(at = @At("HEAD"), method = "pose()Lcom/mojang/blaze3d/vertex/PoseStack$Pose;", cancellable = true)
    private void pose__1210828763(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1210828763L))
            info.setReturnValue(new com.mojang.blaze3d.vertex.PoseStack.Pose());
    }

    @Inject(at = @At("HEAD"), method = "outlineColor()I", cancellable = true)
    private void outlineColor_291912553(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(291912553L))
            info.setReturnValue(-2084553299);
    }

    @Inject(at = @At("HEAD"), method = "lightCoords()I", cancellable = true)
    private void lightCoords__2066115914(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2066115914L))
            info.setReturnValue(-275253009);
    }

    @Inject(at = @At("HEAD"), method = "overlayCoords()I", cancellable = true)
    private void overlayCoords__161965252(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-161965252L))
            info.setReturnValue(1942562664);
    }

    @Inject(at = @At("HEAD"), method = "hasTranslucency()Z", cancellable = true)
    private void hasTranslucency_125914064(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(125914064L))
            info.setReturnValue(false);
    }


}
