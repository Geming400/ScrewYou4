package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.feature.ItemFeatureRenderer.Submit.class)
public class Submit1581413668Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1328041369(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1328041369L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_445953693(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(445953693L))
            info.setReturnValue("䇶,Mj(㤌t=zy#f瓉^烱 >'+uS8g#kv>gs;z%6P0<zDj;⛼w%o]\"D");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1619676410(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1619676410L))
            info.setReturnValue(522137302);
    }

    @Inject(at = @At("HEAD"), method = "overlayCoords()I", cancellable = true)
    private void overlayCoords_1619675914(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1619675914L))
            info.setReturnValue(799156510);
    }

    @Inject(at = @At("HEAD"), method = "displayContext()Lnet/minecraft/world/item/ItemDisplayContext;", cancellable = true)
    private void displayContext_1441073437(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1441073437L))
            info.setReturnValue(net.minecraft.world.item.ItemDisplayContext.FIXED);
    }

    @Inject(at = @At("HEAD"), method = "hasTranslucency()Z", cancellable = true)
    private void hasTranslucency_1619692251(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1619692251L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "distanceToCameraSq()F", cancellable = true)
    private void distanceToCameraSq_1619673031(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1619673031L))
            info.setReturnValue(2.698554E8F);
    }

    @Inject(at = @At("HEAD"), method = "featureType()Lnet/minecraft/client/renderer/feature/FeatureRendererType;", cancellable = true)
    private void featureType__1682470102(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1682470102L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "pose()Lcom/mojang/blaze3d/vertex/PoseStack$Pose;", cancellable = true)
    private void pose__507906732(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-507906732L))
            info.setReturnValue(new com.mojang.blaze3d.vertex.PoseStack$Pose());
    }

    @Inject(at = @At("HEAD"), method = "tintLayers()[I", cancellable = true)
    private void tintLayers__1527712271(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1527712271L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "quads()Ljava/util/List;", cancellable = true)
    private void quads__1087216812(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1087216812L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "foilType()Lnet/minecraft/client/renderer/item/ItemStackRenderState$FoilType;", cancellable = true)
    private void foilType__322194898(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-322194898L))
            info.setReturnValue(net.minecraft.client.renderer.item.ItemStackRenderState.FoilType.NONE);
    }

    @Inject(at = @At("HEAD"), method = "outlineColor()I", cancellable = true)
    private void outlineColor_1619675914(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1619675914L))
            info.setReturnValue(799156510);
    }

    @Inject(at = @At("HEAD"), method = "lightCoords()I", cancellable = true)
    private void lightCoords_1619675914(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1619675914L))
            info.setReturnValue(799156510);
    }


}
