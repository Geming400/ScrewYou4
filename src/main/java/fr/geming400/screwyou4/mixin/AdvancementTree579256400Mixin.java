package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.AdvancementTree.class)
public class AdvancementTree579256400Mixin {
        @Inject(at = @At("HEAD"), method = "remove(Ljava/util/Set;)V", cancellable = true)
    private void remove_35175672(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(35175672L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "get(Lnet/minecraft/resources/Identifier;)Lnet/minecraft/advancements/AdvancementNode;", cancellable = true)
    private void get__1042161988(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1042161988L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "get(Lnet/minecraft/advancements/AdvancementHolder;)Lnet/minecraft/advancements/AdvancementNode;", cancellable = true)
    private void get_1833618137(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1833618137L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "clear()V", cancellable = true)
    private void clear_617531139(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(617531139L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addAll(Ljava/util/Collection;)V", cancellable = true)
    private void addAll_2030577332(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2030577332L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "roots()Ljava/lang/Iterable;", cancellable = true)
    private void roots__1430493288(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1430493288L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "nodes()Ljava/util/Collection;", cancellable = true)
    private void nodes__1234391872(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1234391872L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setListener(Lnet/minecraft/advancements/AdvancementTree$Listener;)V", cancellable = true)
    private void setListener_1707926040(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1707926040L))
            info.cancel();
    }


}
