package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.data.models.blockstates.PropertyValueList.class)
public class PropertyValueList_1584115972Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_675489703(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(675489703L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1940428296(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1940428296L))
            info.setReturnValue("{3D%}F{)4\"vDwqj\u446B%Q\uAE2Cf;6VD].\u6045A'b;\u581Cm$");
    }

    @Inject(at = @At("HEAD"), method = "values()Ljava/util/List;", cancellable = true)
    private void values__1532930219(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1532930219L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_2141468062(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2141468062L))
            info.setReturnValue(1057027198);
    }

    @Inject(at = @At("HEAD"), method = "of([Lnet/minecraft/world/level/block/state/properties/Property$Value;)Lnet/minecraft/client/data/models/blockstates/PropertyValueList;", cancellable = true)
    private static void of_300581612(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(300581612L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getKey()Ljava/lang/String;", cancellable = true)
    private void getKey__1434285323(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1434285323L))
            info.setReturnValue("*9.tH\u89EB19To9RO8");
    }

    @Inject(at = @At("HEAD"), method = "extend(Lnet/minecraft/client/data/models/blockstates/PropertyValueList;)Lnet/minecraft/client/data/models/blockstates/PropertyValueList;", cancellable = true)
    private void extend_2083209468(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2083209468L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "extend(Lnet/minecraft/world/level/block/state/properties/Property$Value;)Lnet/minecraft/client/data/models/blockstates/PropertyValueList;", cancellable = true)
    private void extend__2097529992(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2097529992L))
            info.setReturnValue(null);
    }


}
