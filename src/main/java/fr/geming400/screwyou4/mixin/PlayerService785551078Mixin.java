package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.jsonrpc.methods.PlayerService.class)
public class PlayerService785551078Mixin {
        @Inject(at = @At("HEAD"), method = "get(Lnet/minecraft/server/jsonrpc/internalapi/MinecraftApi;)Ljava/util/List;", cancellable = true)
    private static void get_1220723594(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1220723594L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "kick(Lnet/minecraft/server/jsonrpc/internalapi/MinecraftApi;Ljava/util/List;Lnet/minecraft/server/jsonrpc/methods/ClientInfo;)Ljava/util/List;", cancellable = true)
    private static void kick__679676644(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-679676644L))
            info.setReturnValue(null);
    }


}
