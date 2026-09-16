package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.jsonrpc.internalapi.MinecraftGameRuleServiceImpl.class)
public class MinecraftGameRuleServiceImpl_1336811550Mixin {
        @Inject(at = @At("HEAD"), method = "getAvailableGameRules()Ljava/util/stream/Stream;", cancellable = true)
    private void getAvailableGameRules_1597725824(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1597725824L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "updateGameRule(Lnet/minecraft/server/jsonrpc/methods/GameRulesService$GameRuleUpdate;Lnet/minecraft/server/jsonrpc/methods/ClientInfo;)Lnet/minecraft/server/jsonrpc/methods/GameRulesService$GameRuleUpdate;", cancellable = true)
    private void updateGameRule__151743804(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-151743804L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTypedRule(Lnet/minecraft/world/level/gamerules/GameRule;Ljava/lang/Object;)Lnet/minecraft/server/jsonrpc/methods/GameRulesService$GameRuleUpdate;", cancellable = true)
    private void getTypedRule_1364021792(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1364021792L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getRuleValue(Lnet/minecraft/world/level/gamerules/GameRule;)Ljava/lang/Object;", cancellable = true)
    private void getRuleValue__1419808740(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1419808740L))
            info.setReturnValue(null);
    }


}
