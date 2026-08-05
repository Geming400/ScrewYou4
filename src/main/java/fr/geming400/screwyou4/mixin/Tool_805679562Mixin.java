package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.component.Tool.class)
public class Tool_805679562Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__2103775476(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2103775476L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__329780414(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-329780414L))
            info.setReturnValue("!ypO'S6km\uB4E0f<&\u4F95+uB p2b\uFA9Bf\uCAF7(O}x\u7A68Fpyz,^P\"\uB695v|`Q`96[aN:8 4I`A[0L,90\u2E82`K\u0736$[0UW\u4A8EFcu0py\u0B6BVmxUiD qn7uxE%\u6E96_");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_843942303(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(843942303L))
            info.setReturnValue(-956590220);
    }

    @Inject(at = @At("HEAD"), method = "rules()Ljava/util/List;", cancellable = true)
    private void rules__1862950919(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1862950919L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "damagePerBlock()I", cancellable = true)
    private void damagePerBlock_843941807(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(843941807L))
            info.setReturnValue(1940969070);
    }

    @Inject(at = @At("HEAD"), method = "defaultMiningSpeed()F", cancellable = true)
    private void defaultMiningSpeed_843938924(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(843938924L))
            info.setReturnValue(5.072315E8F);
    }

    @Inject(at = @At("HEAD"), method = "getMiningSpeed(Lnet/minecraft/world/level/block/state/BlockState;)F", cancellable = true)
    private void getMiningSpeed_660371355(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(660371355L))
            info.setReturnValue(5.072315E8F);
    }

    @Inject(at = @At("HEAD"), method = "isCorrectForDrops(Lnet/minecraft/world/level/block/state/BlockState;)Z", cancellable = true)
    private void isCorrectForDrops_660390575(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(660390575L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "canDestroyBlocksInCreative()Z", cancellable = true)
    private void canDestroyBlocksInCreative_843958144(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(843958144L))
            info.setReturnValue(true);
    }


}
