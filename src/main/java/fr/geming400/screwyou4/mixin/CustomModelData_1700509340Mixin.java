package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.component.CustomModelData.class)
public class CustomModelData_1700509340Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_791883071(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(791883071L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1824034432(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1824034432L))
            info.setReturnValue("(\u38C1,+TZ\uB24B)WyG\uFFC7\uB258vG\u055EaqB+t\u7BD4So\uC23BCawY\u8194=nD");
    }

    @Inject(at = @At("HEAD"), method = "flags()Ljava/util/List;", cancellable = true)
    private void flags__1484650030(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1484650030L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__2037105866(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2037105866L))
            info.setReturnValue(-1099354838);
    }

    @Inject(at = @At("HEAD"), method = "getBoolean(I)Ljava/lang/Boolean;", cancellable = true)
    private void getBoolean__1632393610(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1632393610L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getFloat(I)Ljava/lang/Float;", cancellable = true)
    private void getFloat__1385238538(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1385238538L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getString(I)Ljava/lang/String;", cancellable = true)
    private void getString_1734736868(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1734736868L))
            info.setReturnValue("\u5EEB\u6DB62SLPS\uA737'XIz!o';\uD4FBJD.l0Nm7aHu&W d\uC3E3,ZZ&^1f%Y>SPNwaP");
    }

    @Inject(at = @At("HEAD"), method = "strings()Ljava/util/List;", cancellable = true)
    private void strings_1076490829(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1076490829L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getColor(I)Ljava/lang/Integer;", cancellable = true)
    private void getColor_2090655323(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2090655323L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "colors()Ljava/util/List;", cancellable = true)
    private void colors__625653189(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-625653189L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "floats()Ljava/util/List;", cancellable = true)
    private void floats_1175067874(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1175067874L))
            info.setReturnValue(null);
    }


}
