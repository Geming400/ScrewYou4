package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.jsonrpc.internalapi.MinecraftGameRuleServiceImpl.class)
public class MinecraftGameRuleServiceImpl_1336811550Mixin {
        @Inject(at = @At("HEAD"), method = "getAvailableGameRules()Ljava/util/stream/Stream;", cancellable = true)
    private void getAvailableGameRules_1126105234(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1126105234L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "updateGameRule(Lnet/minecraft/server/jsonrpc/methods/GameRulesService$GameRuleUpdate;Lnet/minecraft/server/jsonrpc/methods/ClientInfo;)Lnet/minecraft/server/jsonrpc/methods/GameRulesService$GameRuleUpdate;", cancellable = true)
    private void updateGameRule_263683547(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(263683547L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getRuleValue(Lnet/minecraft/world/level/gamerules/GameRule;)Ljava/lang/Object;", cancellable = true)
    private void getRuleValue_1031214717(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1031214717L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTypedRule(Lnet/minecraft/world/level/gamerules/GameRule;Ljava/lang/Object;)Lnet/minecraft/server/jsonrpc/methods/GameRulesService$GameRuleUpdate;", cancellable = true)
    private void getTypedRule_618022480(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(618022480L))
            info.setReturnValue(null);
    }


}
