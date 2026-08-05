package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.AdvancementHolder.class)
public class AdvancementHolder840889646Mixin {
        @Inject(at = @At("HEAD"), method = "value()Lnet/minecraft/advancements/Advancement;", cancellable = true)
    private void value_1898202357(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1898202357L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__67737118(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-67737118L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1611312675(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1611312675L))
            info.setReturnValue("[6]`fqm\u932Bl-ME-O[pql]\u88D1zg3\uA4E7,Rfl{rs=\u154Fi\uBF03(=@(\u53AB\u11C5mq\u250A`]s");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1398241241(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1398241241L))
            info.setReturnValue(1325808476);
    }

    @Inject(at = @At("HEAD"), method = "id()Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void id__1751888240(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1751888240L))
            info.setReturnValue(null);
    }


}
