package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.attribute.EnvironmentAttributeMap.class)
public class EnvironmentAttributeMap729963061Mixin {
        @Inject(at = @At("HEAD"), method = "get(Lnet/minecraft/world/attribute/EnvironmentAttribute;)Lnet/minecraft/world/attribute/EnvironmentAttributeMap$Entry;", cancellable = true)
    private void get_1555680296(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1555680296L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__178663703(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-178663703L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1500386090(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1500386090L))
            info.setReturnValue("7nqq7M\u2B59)R0:2\u692Bdqv\u5004R)bFJ!\u0641]E\u6574\uC4BEl\u5549<oJ5#,{$S<3\uA36F]\uD562\u02F8pLM[3lqV,");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1287314656(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1287314656L))
            info.setReturnValue(-176545811);
    }

    @Inject(at = @At("HEAD"), method = "builder()Lnet/minecraft/world/attribute/EnvironmentAttributeMap$Builder;", cancellable = true)
    private static void builder_479192784(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(479192784L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "contains(Lnet/minecraft/world/attribute/EnvironmentAttribute;)Z", cancellable = true)
    private void contains_779256911(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(779256911L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "keySet()Ljava/util/Set;", cancellable = true)
    private void keySet_130415092(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(130415092L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "applyModifier(Lnet/minecraft/world/attribute/EnvironmentAttribute;Ljava/lang/Object;)Ljava/lang/Object;", cancellable = true)
    private void applyModifier_473976759(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(473976759L))
            info.setReturnValue(new java.lang.Object());
    }


}
