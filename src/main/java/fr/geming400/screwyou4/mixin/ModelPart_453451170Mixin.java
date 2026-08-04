package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.model.geom.ModelPart.class)
public class ModelPart_453451170Mixin {
        @Inject(at = @At("HEAD"), method = "isEmpty()Z", cancellable = true)
    private void isEmpty_491729752(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(491729752L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "visit(Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/model/geom/ModelPart$Visitor;)V", cancellable = true)
    private void visit_607629762(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(607629762L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getChild(Ljava/lang/String;)Lnet/minecraft/client/model/geom/ModelPart;", cancellable = true)
    private void getChild__1683809520(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1683809520L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "render(Lcom/mojang/blaze3d/vertex/PoseStack;Lcom/mojang/blaze3d/vertex/VertexConsumer;II)V", cancellable = true)
    private void render__481615287(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-481615287L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "render(Lcom/mojang/blaze3d/vertex/PoseStack;Lcom/mojang/blaze3d/vertex/VertexConsumer;III)V", cancellable = true)
    private void render_1558562168(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1558562168L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createPartLookup()Ljava/util/function/Function;", cancellable = true)
    private void createPartLookup__1472721578(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1472721578L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "offsetRotation(Lorg/joml/Vector3f;)V", cancellable = true)
    private void offsetRotation_1710580597(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1710580597L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "offsetScale(Lorg/joml/Vector3f;)V", cancellable = true)
    private void offsetScale_1710580597(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1710580597L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "offsetPos(Lorg/joml/Vector3f;)V", cancellable = true)
    private void offsetPos_1710580597(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1710580597L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setRotation(FFF)V", cancellable = true)
    private void setRotation_1217157002(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1217157002L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getRandomCube(Lnet/minecraft/util/RandomSource;)Lnet/minecraft/client/model/geom/ModelPart$Cube;", cancellable = true)
    private void getRandomCube_541167733(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(541167733L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getExtentsForGui(Lcom/mojang/blaze3d/vertex/PoseStack;Ljava/util/function/Consumer;)V", cancellable = true)
    private void getExtentsForGui_1241892958(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1241892958L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getAllParts()Ljava/util/List;", cancellable = true)
    private void getAllParts_2079787985(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2079787985L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "translateAndRotate(Lcom/mojang/blaze3d/vertex/PoseStack;)V", cancellable = true)
    private void translateAndRotate_500914676(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(500914676L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getInitialPose()Lnet/minecraft/client/model/geom/PartPose;", cancellable = true)
    private void getInitialPose_1355476174(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1355476174L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setInitialPose(Lnet/minecraft/client/model/geom/PartPose;)V", cancellable = true)
    private void setInitialPose_1884254722(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1884254722L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setPos(FFF)V", cancellable = true)
    private void setPos_1217157002(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1217157002L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "resetPose()V", cancellable = true)
    private void resetPose_491725908(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(491725908L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "storePose()Lnet/minecraft/client/model/geom/PartPose;", cancellable = true)
    private void storePose_1355476174(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1355476174L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hasChild(Ljava/lang/String;)Z", cancellable = true)
    private void hasChild_1605816162(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1605816162L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "rotateBy(Lorg/joml/Quaternionf;)V", cancellable = true)
    private void rotateBy_1434111611(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1434111611L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "loadPose(Lnet/minecraft/client/model/geom/PartPose;)V", cancellable = true)
    private void loadPose_1884254722(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1884254722L))
            info.cancel();
    }


}
