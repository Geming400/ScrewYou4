package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.saveddata.maps.MapId.class)
public class MapId_274192455Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__634433814(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-634433814L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1044615979(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1044615979L))
            info.setReturnValue("b\u3B72+zx2\u8858h\uAAB2l$yA\u0C7B7m?e<DY1l$8ll\uB8B9BYMOD\u5EC6v\uCDB0HLdM#p{\u4C7CTIxOx\uD3CC9l(Oz/,<8(.L`f\uD316KaL3@\u933B\uBC60MpLxK_=4\u1BE2J6M\u1C76{i");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_831544545(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(831544545L))
            info.setReturnValue(244415673);
    }

    @Inject(at = @At("HEAD"), method = "id()I", cancellable = true)
    private void id_1873975793(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1873975793L))
            info.setReturnValue(889023398);
    }

    @Inject(at = @At("HEAD"), method = "key()Ljava/lang/String;", cancellable = true)
    private void key__1964436242(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1964436242L))
            info.setReturnValue("&6=Hju\u9C42S?7!\u11A0mJ$>2%VE#X\u796E\u986D\u2150Noc8[9DgM&,\u7971wloJ");
    }

    @Inject(at = @At("HEAD"), method = "addToTooltip(Lnet/minecraft/world/item/Item$TooltipContext;Ljava/util/function/Consumer;Lnet/minecraft/world/item/TooltipFlag;Lnet/minecraft/core/component/DataComponentGetter;)V", cancellable = true)
    private void addToTooltip__2101027593(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2101027593L))
            info.cancel();
    }


}
