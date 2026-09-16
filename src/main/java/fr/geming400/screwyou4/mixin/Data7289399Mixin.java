package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.crafting.ShapedRecipePattern.Data.class)
public class Data7289399Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__901336869(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-901336869L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_777712924(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(777712924L))
            info.setReturnValue("]df#DcS sr9>aMpH\u2917!sD%Ov3<ncyPw7:\uB9EExsA\u1D5FdAEOq|)\uAF9DK8\u662BtGo6)\u79D0^^AT{]+JT%03K\uB496z`Up |9v\u3AE6V;zS`");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_564641490(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(564641490L))
            info.setReturnValue(-617093412);
    }

    @Inject(at = @At("HEAD"), method = "pattern()Ljava/util/List;", cancellable = true)
    private void pattern__711021577(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-711021577L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "key()Ljava/util/Map;", cancellable = true)
    private void key_917456992(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(917456992L))
            info.setReturnValue(null);
    }


}
