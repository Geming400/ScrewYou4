package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.component.UseRemainder.class)
public class UseRemainder_1454331524Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1455123514(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1455123514L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_318871548(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(318871548L))
            info.setReturnValue("z}_l#.ZF$>l\u8DFA\u75B4%3a9\u2A70WOo\u47EEx#4:;okMA8:j=}7\u8152p BW=56\u6F68^\u2544\uAFD2!T:$Su\u7A0C+0s9{4ha\uCE143C|b%\uCD2EM0\u0EA8_S6c<");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1492594265(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1492594265L))
            info.setReturnValue(-1173879786);
    }

    @Inject(at = @At("HEAD"), method = "convertInto()Lnet/minecraft/world/item/ItemStackTemplate;", cancellable = true)
    private void convertInto__1086748467(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1086748467L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "convertIntoRemainder(Lnet/minecraft/world/item/ItemStack;IZLnet/minecraft/world/item/component/UseRemainder$OnExtraCreatedRemainder;)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void convertIntoRemainder_829763979(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(829763979L))
            info.setReturnValue(null);
    }


}
