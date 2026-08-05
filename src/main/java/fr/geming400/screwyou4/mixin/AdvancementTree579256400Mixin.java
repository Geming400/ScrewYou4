package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.AdvancementTree.class)
public class AdvancementTree579256400Mixin {
        @Inject(at = @At("HEAD"), method = "remove(Ljava/util/Set;)V", cancellable = true)
    private void remove_1846954876(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1846954876L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "get(Lnet/minecraft/resources/Identifier;)Lnet/minecraft/advancements/AdvancementNode;", cancellable = true)
    private void get_167425810(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(167425810L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "get(Lnet/minecraft/advancements/AdvancementHolder;)Lnet/minecraft/advancements/AdvancementNode;", cancellable = true)
    private void get_1930014639(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1930014639L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "clear()V", cancellable = true)
    private void clear__206571306(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-206571306L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addAll(Ljava/util/Collection;)V", cancellable = true)
    private void addAll__1219975820(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1219975820L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "roots()Ljava/lang/Iterable;", cancellable = true)
    private void roots__1924865943(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1924865943L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "nodes()Ljava/util/Collection;", cancellable = true)
    private void nodes__496446415(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-496446415L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setListener(Lnet/minecraft/advancements/AdvancementTree$Listener;)V", cancellable = true)
    private void setListener_274970062(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(274970062L))
            info.cancel();
    }


}
