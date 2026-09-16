package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.gamerules.GameRuleMap.class)
public class GameRuleMap_1312609616Mixin {
        @Inject(at = @At("HEAD"), method = "remove(Lnet/minecraft/world/level/gamerules/GameRule;)Ljava/lang/Object;", cancellable = true)
    private void remove__261963213(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-261963213L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "size()I", cancellable = true)
    private void size_1756341204(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1756341204L))
            info.setReturnValue(-128931732);
    }

    @Inject(at = @At("HEAD"), method = "reset(Lnet/minecraft/world/level/gamerules/GameRule;)V", cancellable = true)
    private void reset__2092025106(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2092025106L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "get(Lnet/minecraft/world/level/gamerules/GameRule;)Ljava/lang/Object;", cancellable = true)
    private void get_1813385221(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1813385221L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_403982851(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(403982851L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_2083032644(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2083032644L))
            info.setReturnValue("02\u8032[R,,\u2514yR60\u4628evl\uB454\u2C9C`aty8y(H\u8D02u%$Q.AYqV^y\u4806h:2\uC2DB\u2AFB\u09FC`B\u3987}Gnkn!i\u16A59`6");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1869961210(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1869961210L))
            info.setReturnValue(-1263909430);
    }

    @Inject(at = @At("HEAD"), method = "copyOf(Lnet/minecraft/world/level/gamerules/GameRuleMap;)Lnet/minecraft/world/level/gamerules/GameRuleMap;", cancellable = true)
    private static void copyOf_2067690494(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2067690494L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "of()Lnet/minecraft/world/level/gamerules/GameRuleMap;", cancellable = true)
    private static void of_1543432588(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1543432588L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "of(Ljava/util/stream/Stream;)Lnet/minecraft/world/level/gamerules/GameRuleMap;", cancellable = true)
    private static void of_1607846114(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1607846114L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "set(Lnet/minecraft/world/level/gamerules/GameRule;Ljava/lang/Object;)V", cancellable = true)
    private void set__296687017(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-296687017L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "keySet()Ljava/util/Set;", cancellable = true)
    private void keySet_713061646(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(713061646L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "has(Lnet/minecraft/world/level/gamerules/GameRule;)Z", cancellable = true)
    private void has_686157511(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(686157511L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "withOther(Lnet/minecraft/world/level/gamerules/GameRuleMap;)Lnet/minecraft/world/level/gamerules/GameRuleMap;", cancellable = true)
    private void withOther_451870276(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(451870276L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setFromIf(Lnet/minecraft/world/level/gamerules/GameRuleMap;Ljava/util/function/Predicate;)V", cancellable = true)
    private void setFromIf__565883383(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-565883383L))
            info.cancel();
    }


}
