package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.data.loot.LootTableProvider.MissingTableProblem.class)
public class MissingTableProblem_1534726028Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_626099759(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(626099759L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1989817744(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1989817744L))
            info.setReturnValue("3mxy Mw\u4BB01P(>2S!z_\u86A7b[>qW6jLDbGl>A+-xW\u0AEB`d<?jETalelR\uBF56,!U9f(ILA\u7481&9/pcmq'}(Qf;\u5C8F1\u3BBA5f\uC141'X");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_2092078118(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2092078118L))
            info.setReturnValue(273252642);
    }

    @Inject(at = @At("HEAD"), method = "id()Lnet/minecraft/resources/ResourceKey;", cancellable = true)
    private void id_1997133313(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1997133313L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "description()Ljava/lang/String;", cancellable = true)
    private void description_360738320(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(360738320L))
            info.setReturnValue("vBklZTUX6\u292C\uFD1B6aaPIs\uB22AtI(83'&\uA1ABqD?2_Lcjr|lA+\u60D6\u6385OVec\u1BC0f\u80BD0ZyxEZi,&|P4sxH\uCA45./iPCs\u27A3;BY\uB984P8`");
    }


}
