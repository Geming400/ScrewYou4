package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.model.geom.builders.PartDefinition.class)
public class PartDefinition_1790973780Mixin {
        @Inject(at = @At("HEAD"), method = "getChildren()Ljava/util/Set;", cancellable = true)
    private void getChildren__38061707(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-38061707L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getChild(Ljava/lang/String;)Lnet/minecraft/client/model/geom/builders/PartDefinition;", cancellable = true)
    private void getChild_34150337(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(34150337L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "clearChild(Ljava/lang/String;)Lnet/minecraft/client/model/geom/builders/PartDefinition;", cancellable = true)
    private void clearChild_34150337(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(34150337L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "clearRecursively()Lnet/minecraft/client/model/geom/builders/PartDefinition;", cancellable = true)
    private void clearRecursively_1935483319(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1935483319L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "bake(II)Lnet/minecraft/client/model/geom/ModelPart;", cancellable = true)
    private void bake_1387285592(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1387285592L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "transformed(Ljava/util/function/UnaryOperator;)Lnet/minecraft/client/model/geom/builders/PartDefinition;", cancellable = true)
    private void transformed__795305206(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-795305206L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "retainExactParts(Ljava/util/Set;)V", cancellable = true)
    private void retainExactParts_1246893051(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1246893051L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "retainPartsAndChildren(Ljava/util/Set;)V", cancellable = true)
    private void retainPartsAndChildren_1246893051(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1246893051L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addOrReplaceChild(Ljava/lang/String;Lnet/minecraft/client/model/geom/builders/PartDefinition;)Lnet/minecraft/client/model/geom/builders/PartDefinition;", cancellable = true)
    private void addOrReplaceChild__1700073372(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1700073372L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addOrReplaceChild(Ljava/lang/String;Lnet/minecraft/client/model/geom/builders/CubeListBuilder;Lnet/minecraft/client/model/geom/PartPose;)Lnet/minecraft/client/model/geom/builders/PartDefinition;", cancellable = true)
    private void addOrReplaceChild__1884851312(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1884851312L))
            info.setReturnValue(null);
    }


}
