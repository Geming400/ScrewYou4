package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.ServerAdvancementManager.class)
public class ServerAdvancementManager_2039411116Mixin {
        @Inject(at = @At("HEAD"), method = "get(Lnet/minecraft/resources/Identifier;)Lnet/minecraft/advancements/AdvancementHolder;", cancellable = true)
    private void get__615629075(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-615629075L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "tree()Lnet/minecraft/advancements/AdvancementTree;", cancellable = true)
    private void tree_1624389251(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1624389251L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getAllAdvancements()Ljava/util/Collection;", cancellable = true)
    private void getAllAdvancements_225762843(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(225762843L))
            info.setReturnValue(null);
    }


}
