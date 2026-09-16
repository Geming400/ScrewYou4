package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.MultiblockChestResources.class)
public class MultiblockChestResources1413607182Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_504980914(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(504980914L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__2110936589(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2110936589L))
            info.setReturnValue("*<?Q\u445D.Y");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1970959273(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1970959273L))
            info.setReturnValue(-850066953);
    }

    @Inject(at = @At("HEAD"), method = "map(Ljava/util/function/Function;)Lnet/minecraft/client/renderer/MultiblockChestResources;", cancellable = true)
    private void map__235501852(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-235501852L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "single()Ljava/lang/Object;", cancellable = true)
    private void single_71537393(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(71537393L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "left()Ljava/lang/Object;", cancellable = true)
    private void left__1192704656(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1192704656L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "right()Ljava/lang/Object;", cancellable = true)
    private void right_970586565(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(970586565L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "select(Lnet/minecraft/world/level/block/state/properties/ChestType;)Ljava/lang/Object;", cancellable = true)
    private void select__701857583(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-701857583L))
            info.setReturnValue(new java.lang.Object());
    }


}
