package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.model.geom.ModelPart.class)
public class ModelPart_453451170Mixin {
        @Inject(at = @At("HEAD"), method = "isEmpty()Z", cancellable = true)
    private void isEmpty_1512567541(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1512567541L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "visit(Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/model/geom/ModelPart$Visitor;)V", cancellable = true)
    private void visit_140354647(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(140354647L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getChild(Ljava/lang/String;)Lnet/minecraft/client/model/geom/ModelPart;", cancellable = true)
    private void getChild_1306336362(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1306336362L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setPos(FFF)V", cancellable = true)
    private void setPos_1668034588(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1668034588L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "offsetRotation(Lorg/joml/Vector3f;)V", cancellable = true)
    private void offsetRotation__162024026(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-162024026L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "offsetScale(Lorg/joml/Vector3f;)V", cancellable = true)
    private void offsetScale_1686161132(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1686161132L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createPartLookup()Ljava/util/function/Function;", cancellable = true)
    private void createPartLookup_322450701(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(322450701L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "render(Lcom/mojang/blaze3d/vertex/PoseStack;Lcom/mojang/blaze3d/vertex/VertexConsumer;II)V", cancellable = true)
    private void render__941899937(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-941899937L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "render(Lcom/mojang/blaze3d/vertex/PoseStack;Lcom/mojang/blaze3d/vertex/VertexConsumer;III)V", cancellable = true)
    private void render_174639906(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(174639906L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setRotation(FFF)V", cancellable = true)
    private void setRotation__450230902(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-450230902L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "offsetPos(Lorg/joml/Vector3f;)V", cancellable = true)
    private void offsetPos_1602853174(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1602853174L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getAllParts()Ljava/util/List;", cancellable = true)
    private void getAllParts_1878796934(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1878796934L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "translateAndRotate(Lcom/mojang/blaze3d/vertex/PoseStack;)V", cancellable = true)
    private void translateAndRotate_1900718424(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1900718424L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getRandomCube(Lnet/minecraft/util/RandomSource;)Lnet/minecraft/client/model/geom/ModelPart$Cube;", cancellable = true)
    private void getRandomCube_1113696679(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1113696679L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getInitialPose()Lnet/minecraft/client/model/geom/PartPose;", cancellable = true)
    private void getInitialPose__1613766835(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1613766835L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setInitialPose(Lnet/minecraft/client/model/geom/PartPose;)V", cancellable = true)
    private void setInitialPose__1083419281(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1083419281L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getExtentsForGui(Lcom/mojang/blaze3d/vertex/PoseStack;Ljava/util/function/Consumer;)V", cancellable = true)
    private void getExtentsForGui__1351334695(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1351334695L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "resetPose()V", cancellable = true)
    private void resetPose_2145307092(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2145307092L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "loadPose(Lnet/minecraft/client/model/geom/PartPose;)V", cancellable = true)
    private void loadPose_426983051(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(426983051L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "rotateBy(Lorg/joml/Quaternionf;)V", cancellable = true)
    private void rotateBy_2043639849(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2043639849L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "hasChild(Ljava/lang/String;)Z", cancellable = true)
    private void hasChild__178522496(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-178522496L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "storePose()Lnet/minecraft/client/model/geom/PartPose;", cancellable = true)
    private void storePose__1546483104(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1546483104L))
            info.setReturnValue(null);
    }


}
