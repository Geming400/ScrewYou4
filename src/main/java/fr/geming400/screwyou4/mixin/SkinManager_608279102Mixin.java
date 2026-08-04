package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.resources.SkinManager.class)
public class SkinManager_608279102Mixin {
        @Inject(at = @At("HEAD"), method = "get(Lcom/mojang/authlib/GameProfile;)Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private void get_1626322721(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1626322721L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createLookup(Lcom/mojang/authlib/GameProfile;Z)Ljava/util/function/Supplier;", cancellable = true)
    private void createLookup__239518193(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-239518193L))
            info.setReturnValue(null);
    }


}
