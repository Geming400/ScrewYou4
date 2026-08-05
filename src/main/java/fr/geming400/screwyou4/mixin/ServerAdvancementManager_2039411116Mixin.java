package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.ServerAdvancementManager.class)
public class ServerAdvancementManager_2039411116Mixin {
        @Inject(at = @At("HEAD"), method = "get(Lnet/minecraft/resources/Identifier;)Lnet/minecraft/advancements/AdvancementHolder;", cancellable = true)
    private void get__2137892413(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2137892413L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "tree()Lnet/minecraft/advancements/AdvancementTree;", cancellable = true)
    private void tree_1680061985(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1680061985L))
            info.setReturnValue(new net.minecraft.advancements.AdvancementTree());
    }

    @Inject(at = @At("HEAD"), method = "getAllAdvancements()Ljava/util/Collection;", cancellable = true)
    private void getAllAdvancements__325969351(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-325969351L))
            info.setReturnValue(null);
    }


}
