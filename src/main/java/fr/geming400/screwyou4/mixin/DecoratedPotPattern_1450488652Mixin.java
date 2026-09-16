package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.entity.DecoratedPotPattern.class)
public class DecoratedPotPattern_1450488652Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_541862383(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(541862383L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__2074055120(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2074055120L))
            info.setReturnValue("iR\u3E34>I\u59C3\uBF15df9[NywcS[sj\uB7A9S?mtrQva>[4_]U!p4C89)hzK@<#T8{1_KS@*=\u435C");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_2007840742(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2007840742L))
            info.setReturnValue(1632005701);
    }

    @Inject(at = @At("HEAD"), method = "assetId()Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void assetId__496785475(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-496785475L))
            info.setReturnValue(null);
    }


}
