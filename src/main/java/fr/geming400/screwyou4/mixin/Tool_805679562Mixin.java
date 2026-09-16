package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.component.Tool.class)
public class Tool_805679562Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__102946707(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-102946707L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1576103086(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1576103086L))
            info.setReturnValue("\u6490\u5CF1Il\u01F1U%F:jvXy?Zi<Fe3]YZ&|O7zOVNT(?Bh\u8D0Fj\uCCD4|W(6%,Mi_dsJpVbryH'Z3+\u387F%QR|2l=nR6");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1363031652(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1363031652L))
            info.setReturnValue(-1816421258);
    }

    @Inject(at = @At("HEAD"), method = "rules()Ljava/util/List;", cancellable = true)
    private void rules__1550596240(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1550596240L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "damagePerBlock()I", cancellable = true)
    private void damagePerBlock__1233972976(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1233972976L))
            info.setReturnValue(341783602);
    }

    @Inject(at = @At("HEAD"), method = "isCorrectForDrops(Lnet/minecraft/world/level/block/state/BlockState;)Z", cancellable = true)
    private void isCorrectForDrops__230702028(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-230702028L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getMiningSpeed(Lnet/minecraft/world/level/block/state/BlockState;)F", cancellable = true)
    private void getMiningSpeed_1924466138(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1924466138L))
            info.setReturnValue(4.567456E8F);
    }

    @Inject(at = @At("HEAD"), method = "canDestroyBlocksInCreative()Z", cancellable = true)
    private void canDestroyBlocksInCreative_1949412796(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1949412796L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "defaultMiningSpeed()F", cancellable = true)
    private void defaultMiningSpeed__446088874(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-446088874L))
            info.setReturnValue(4.567456E8F);
    }


}
