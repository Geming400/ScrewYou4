package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.model.geom.builders.PartDefinition.class)
public class PartDefinition_1790973780Mixin {
        @Inject(at = @At("HEAD"), method = "getChildren()Ljava/util/Set;", cancellable = true)
    private void getChildren_1513732064(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1513732064L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getChild(Ljava/lang/String;)Lnet/minecraft/client/model/geom/builders/PartDefinition;", cancellable = true)
    private void getChild__1185893477(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1185893477L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "clearRecursively()Lnet/minecraft/client/model/geom/builders/PartDefinition;", cancellable = true)
    private void clearRecursively__922541499(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-922541499L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "bake(II)Lnet/minecraft/client/model/geom/ModelPart;", cancellable = true)
    private void bake_1431222175(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1431222175L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "clearChild(Ljava/lang/String;)Lnet/minecraft/client/model/geom/builders/PartDefinition;", cancellable = true)
    private void clearChild__229408494(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-229408494L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "transformed(Ljava/util/function/UnaryOperator;)Lnet/minecraft/client/model/geom/builders/PartDefinition;", cancellable = true)
    private void transformed_609830047(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(609830047L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addOrReplaceChild(Ljava/lang/String;Lnet/minecraft/client/model/geom/builders/CubeListBuilder;Lnet/minecraft/client/model/geom/PartPose;)Lnet/minecraft/client/model/geom/builders/PartDefinition;", cancellable = true)
    private void addOrReplaceChild_553715908(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(553715908L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addOrReplaceChild(Ljava/lang/String;Lnet/minecraft/client/model/geom/builders/PartDefinition;)Lnet/minecraft/client/model/geom/builders/PartDefinition;", cancellable = true)
    private void addOrReplaceChild__956644432(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-956644432L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "retainExactParts(Ljava/util/Set;)V", cancellable = true)
    private void retainExactParts_436782849(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(436782849L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "retainPartsAndChildren(Ljava/util/Set;)V", cancellable = true)
    private void retainPartsAndChildren_1372551574(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1372551574L))
            info.cancel();
    }


}
