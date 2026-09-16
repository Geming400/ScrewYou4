package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.AdvancementNode.class)
public class AdvancementNode404681140Mixin {
        @Inject(at = @At("HEAD"), method = "parent()Lnet/minecraft/advancements/AdvancementNode;", cancellable = true)
    private void parent_1571520082(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1571520082L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__503945624(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-503945624L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1175104169(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1175104169L))
            info.setReturnValue("Hf_Rt1=x,}0");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_962032735(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(962032735L))
            info.setReturnValue(-1637678026);
    }

    @Inject(at = @At("HEAD"), method = "holder()Lnet/minecraft/advancements/AdvancementHolder;", cancellable = true)
    private void holder_1153673514(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1153673514L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "root()Lnet/minecraft/advancements/AdvancementNode;", cancellable = true)
    private void root_58697354(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(58697354L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getRoot(Lnet/minecraft/advancements/AdvancementNode;)Lnet/minecraft/advancements/AdvancementNode;", cancellable = true)
    private static void getRoot_1854895587(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1854895587L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "children()Ljava/lang/Iterable;", cancellable = true)
    private void children__1655395845(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1655395845L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addChild(Lnet/minecraft/advancements/AdvancementNode;)V", cancellable = true)
    private void addChild_1424726977(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1424726977L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "advancement()Lnet/minecraft/advancements/Advancement;", cancellable = true)
    private void advancement__1450954134(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1450954134L))
            info.setReturnValue(null);
    }


}
