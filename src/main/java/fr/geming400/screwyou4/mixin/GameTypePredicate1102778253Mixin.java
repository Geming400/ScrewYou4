package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.predicates.GameTypePredicate.class)
public class GameTypePredicate1102778253Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1806676784(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1806676784L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__32681722(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-32681722L))
            info.setReturnValue("\uCC28r\u6F58mlJ!S\u3031-jI^(,*&fz\u0C84\uFA93hY\u0B09\uA2AD3N\u4CAFu6Ro60\uB290\u18CC.FKIt/I\u754A4s>\uC2F0L\uA412<u?!zT\u8F04#_W");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1141040995(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1141040995L))
            info.setReturnValue(1414937485);
    }

    @Inject(at = @At("HEAD"), method = "of([Lnet/minecraft/world/level/GameType;)Lnet/minecraft/advancements/predicates/GameTypePredicate;", cancellable = true)
    private static void of_330940027(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(330940027L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "matches(Lnet/minecraft/world/level/GameType;)Z", cancellable = true)
    private void matches_1349058731(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1349058731L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "types()Ljava/util/List;", cancellable = true)
    private void types__1565852227(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1565852227L))
            info.setReturnValue(null);
    }


}
