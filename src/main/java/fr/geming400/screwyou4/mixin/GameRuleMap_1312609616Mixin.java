package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.gamerules.GameRuleMap.class)
public class GameRuleMap_1312609616Mixin {
        @Inject(at = @At("HEAD"), method = "remove(Lnet/minecraft/world/level/gamerules/GameRule;)Ljava/lang/Object;", cancellable = true)
    private void remove_1007012783(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1007012783L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "size()I", cancellable = true)
    private void size_1350871861(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1350871861L))
            info.setReturnValue(1306741521);
    }

    @Inject(at = @At("HEAD"), method = "reset(Lnet/minecraft/world/level/gamerules/GameRule;)V", cancellable = true)
    private void reset_1915737245(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1915737245L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "get(Lnet/minecraft/world/level/gamerules/GameRule;)Ljava/lang/Object;", cancellable = true)
    private void get_1007012783(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1007012783L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1596845918(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1596845918L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_177149144(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(177149144L))
            info.setReturnValue(".1!蜴BHdTCd6{y终@]D鳑QgBdU,=鰚R 7b˷08#`wJ*");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1350871861(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1350871861L))
            info.setReturnValue(1306741521);
    }

    @Inject(at = @At("HEAD"), method = "copyOf(Lnet/minecraft/world/level/gamerules/GameRuleMap;)Lnet/minecraft/world/level/gamerules/GameRuleMap;", cancellable = true)
    private static void copyOf_971416786(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(971416786L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "of()Lnet/minecraft/world/level/gamerules/GameRuleMap;", cancellable = true)
    private static void of_158957315(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(158957315L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "of(Ljava/util/stream/Stream;)Lnet/minecraft/world/level/gamerules/GameRuleMap;", cancellable = true)
    private static void of_1224898379(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1224898379L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "set(Lnet/minecraft/world/level/gamerules/GameRule;Ljava/lang/Object;)V", cancellable = true)
    private void set_14166393(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(14166393L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "keySet()Ljava/util/Set;", cancellable = true)
    private void keySet__516425871(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-516425871L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "has(Lnet/minecraft/world/level/gamerules/GameRule;)Z", cancellable = true)
    private void has_1915741089(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1915741089L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "setFromIf(Lnet/minecraft/world/level/gamerules/GameRuleMap;Ljava/util/function/Predicate;)V", cancellable = true)
    private void setFromIf_1397468960(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1397468960L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "withOther(Lnet/minecraft/world/level/gamerules/GameRuleMap;)Lnet/minecraft/world/level/gamerules/GameRuleMap;", cancellable = true)
    private void withOther_971416538(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(971416538L))
            info.setReturnValue(null);
    }


}
