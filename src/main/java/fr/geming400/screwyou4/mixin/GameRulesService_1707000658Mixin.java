package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.jsonrpc.methods.GameRulesService.class)
public class GameRulesService_1707000658Mixin {
        @Inject(at = @At("HEAD"), method = "get(Lnet/minecraft/server/jsonrpc/internalapi/MinecraftApi;)Ljava/util/List;", cancellable = true)
    private static void get_741255435(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(741255435L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "update(Lnet/minecraft/server/jsonrpc/internalapi/MinecraftApi;Lnet/minecraft/server/jsonrpc/methods/GameRulesService$GameRuleUpdate;Lnet/minecraft/server/jsonrpc/methods/ClientInfo;)Lnet/minecraft/server/jsonrpc/methods/GameRulesService$GameRuleUpdate;", cancellable = true)
    private static void update_534106293(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(534106293L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTypedRule(Lnet/minecraft/server/jsonrpc/internalapi/MinecraftApi;Lnet/minecraft/world/level/gamerules/GameRule;Ljava/lang/Object;)Lnet/minecraft/server/jsonrpc/methods/GameRulesService$GameRuleUpdate;", cancellable = true)
    private static void getTypedRule__747016306(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-747016306L))
            info.setReturnValue(null);
    }


}
