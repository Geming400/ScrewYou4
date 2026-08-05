package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.state.properties.IntegerProperty.class)
public class IntegerProperty1133365Mixin {
        @Inject(at = @At("HEAD"), method = "getName(Ljava/lang/Comparable;)Ljava/lang/String;", cancellable = true)
    private void getName__1169527875(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1169527875L))
            info.setReturnValue("'.E\u1252O|+f\u5997\uD5EFV\u7D05F4]B{vB8D#I?,\u426A>vO?byW[@NTd/;@VBL<&roH\uAFE54\u89BDO\"28");
    }

    @Inject(at = @At("HEAD"), method = "getName(Ljava/lang/Integer;)Ljava/lang/String;", cancellable = true)
    private void getName__948227023(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-948227023L))
            info.setReturnValue("D%T|:\uD091\"=I#(Y7$bs27\u5C39\u8278*(N!i^.Y>q2J$ xsJkD\u09F8i)zhS\uC914ha\u633F\u7014tpir\uC4D0\u3EF8%2\uB9D7=)%s-q^Rc6AF");
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1386645128(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1386645128L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getValue(Ljava/lang/String;)Ljava/util/Optional;", cancellable = true)
    private void getValue_2011168921(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2011168921L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "create(Ljava/lang/String;II)Lnet/minecraft/world/level/block/state/properties/IntegerProperty;", cancellable = true)
    private static void create__864088642(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-864088642L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "generateHashCode()I", cancellable = true)
    private void generateHashCode_39395611(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(39395611L))
            info.setReturnValue(1329412733);
    }

    @Inject(at = @At("HEAD"), method = "getInternalIndex(Ljava/lang/Integer;)I", cancellable = true)
    private void getInternalIndex_1011677000(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1011677000L))
            info.setReturnValue(1692200134);
    }

    @Inject(at = @At("HEAD"), method = "getInternalIndex(Ljava/lang/Comparable;)I", cancellable = true)
    private void getInternalIndex__1249874500(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1249874500L))
            info.setReturnValue(-417259363);
    }

    @Inject(at = @At("HEAD"), method = "getPossibleValues()Ljava/util/List;", cancellable = true)
    private void getPossibleValues_1627470181(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1627470181L))
            info.setReturnValue(null);
    }


}
